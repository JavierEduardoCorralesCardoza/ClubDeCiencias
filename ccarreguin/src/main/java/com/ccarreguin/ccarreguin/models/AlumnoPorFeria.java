package com.ccarreguin.ccarreguin.models;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.ManyToOne;

public class AlumnoPorFeria {

    @EmbeddedId
    private AlumnoPorFeriaId id;

    @ManyToOne
    @Column(name = "idAlumnoCompuesto")
    private Alumnos alumno;

    @ManyToOne
    @Column(name = "idFeriaCompuesta")
    private Ferias feria;

    @ManyToOne
    @Column(name = "IDApoyoAlumnoFeria")
    private Apoyos apoyo;

    @Column(name = "Premio")
    private String premio;

    public AlumnoPorFeriaId getId() {
        return id;
    }

    public void setId(AlumnoPorFeriaId id) {
        this.id = id;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public Ferias getFeria() {
        return feria;
    }

    public void setFeria(Ferias feria) {
        this.feria = feria;
    }

    public Apoyos getApoyo() {
        return apoyo;
    }

    public void setApoyo(Apoyos apoyo) {
        this.apoyo = apoyo;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }
}
