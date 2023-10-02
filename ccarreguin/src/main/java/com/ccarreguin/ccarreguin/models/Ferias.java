package com.ccarreguin.ccarreguin.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ferias {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDFeria")
    private int idFeria;

    @Column(name = "NombreFeria")
    private String nombreFeria;

    @Column(name = "Fecha")
    private String fecha;

    public int getIdFeria() {
        return idFeria;
    }

    public void setIdFeria(int idFeria) {
        this.idFeria = idFeria;
    }

    public String getNombreFeria() {
        return nombreFeria;
    }

    public void setNombreFeria(String nombreFeria) {
        this.nombreFeria = nombreFeria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
