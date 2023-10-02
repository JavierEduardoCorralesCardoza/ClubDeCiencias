package com.ccarreguin.ccarreguin.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AlumnoPorFeriaId implements Serializable{

    @Column(name = "IDAlumnoFeria")
    private int idAlumnoCompuesto;

    @Column(name = "IDFeriaAlumno")
    private int idFeriaCompuesto;

    public int getIdAlumnoCompuesto() {
        return idAlumnoCompuesto;
    }

    public void setIdAlumnoCompuesto(int idAlumnoCompuesto) {
        this.idAlumnoCompuesto = idAlumnoCompuesto;
    }

    public int getIdFeriaCompuesto() {
        return idFeriaCompuesto;
    }

    public void setIdFeriaCompuesto(int idFeriaCompuesto) {
        this.idFeriaCompuesto = idFeriaCompuesto;
    }
}
