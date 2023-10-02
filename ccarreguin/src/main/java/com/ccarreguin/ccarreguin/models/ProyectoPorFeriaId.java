package com.ccarreguin.ccarreguin.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProyectoPorFeriaId implements Serializable{

    @Column(name = "IDProyectoFeria")
    private int idProyectoCompuesto;

    @Column(name = "IDFeriaProyecto")
    private int idFeriaCompuesto;

    public int getIdProyectoCompuesto() {
        return idProyectoCompuesto;
    }

    public void setIdProyectoCompuesto(int idProyectoCompuesto) {
        this.idProyectoCompuesto = idProyectoCompuesto;
    }

    public int getIdFeriaCompuesto() {
        return idFeriaCompuesto;
    }

    public void setIdFeriaCompuesto(int idFeriaCompuesto) {
        this.idFeriaCompuesto = idFeriaCompuesto;
    }
}
