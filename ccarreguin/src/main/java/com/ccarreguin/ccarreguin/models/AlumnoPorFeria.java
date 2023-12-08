package com.ccarreguin.ccarreguin.models;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name =  "AlumnoPorFeria")
public class AlumnoPorFeria {
    
    @EmbeddedId
    private AlumnoPorFeriaId id;

    @ManyToOne
    @MapsId("alumno_correo")
    @JoinColumn(name = "IDAlumnoFeria", referencedColumnName = "CorreoAlumno")
    private Alumnos alumno;

    @ManyToOne
    @MapsId("feria_id")
    @JoinColumn(name = "IDFeriaAlumno", referencedColumnName = "IDFeria")
    private Ferias feria;

    @Column(name = "Premio")
    private String premio;

    public AlumnoPorFeria() {
    }

    public AlumnoPorFeria(AlumnoPorFeriaId id, Alumnos alumno, Ferias feria, String premio) {
        this.id = id;
        this.alumno = alumno;
        this.feria = feria;
        this.premio = premio;
    }

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

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }
}
