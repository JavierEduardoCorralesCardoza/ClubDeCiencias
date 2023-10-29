package com.ccarreguin.ccarreguin.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Apoyos")
public class Apoyos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDApoyo")
    private int id_apoyo;

    @Column(name = "Patrocinador")
    private String patrocinador;

    @Column(name = "ApoyoOtorgado")
    private int apoyo_otrogado;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "IDAlumnoFeriaApoyo", referencedColumnName = "IDAlumnoFeria"),
        @JoinColumn(name = "IDFeriaAlumnoApoyo", referencedColumnName = "IDFeriaAlumno")
    })
    private AlumnoPorFeria alumno_feria;

    public Apoyos() {
    }

    public Apoyos(int id_apoyo, String patrocinador, int apoyo_otrogado, AlumnoPorFeria alumno_feria) {
        this.id_apoyo = id_apoyo;
        this.patrocinador = patrocinador;
        this.apoyo_otrogado = apoyo_otrogado;
        this.alumno_feria = alumno_feria;
    }

    public int getId_apoyo() {
        return id_apoyo;
    }

    public void setId_apoyo(int id_apoyo) {
        this.id_apoyo = id_apoyo;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public int getApoyo_otrogado() {
        return apoyo_otrogado;
    }

    public void setApoyo_otrogado(int apoyo_otrogado) {
        this.apoyo_otrogado = apoyo_otrogado;
    }

    public AlumnoPorFeria getAlumno_feria() {
        return alumno_feria;
    }

    public void setAlumno_feria(AlumnoPorFeria alumno_feria) {
        this.alumno_feria = alumno_feria;
    }
}
