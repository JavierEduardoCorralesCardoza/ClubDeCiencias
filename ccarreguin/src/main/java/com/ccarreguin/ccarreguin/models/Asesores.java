package com.ccarreguin.ccarreguin.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Asesores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDAsesor")
    private long idAsesor;

    @Column(name = "NombreAsesor")
    private String nombreAsesor;

    public long getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(long idAsesor) {
        this.idAsesor = idAsesor;
    }

    public String getNombreAsesor() {
        return nombreAsesor;
    }

    public void setNombreAsesor(String nombreAsesor) {
        this.nombreAsesor = nombreAsesor;
    }
}
