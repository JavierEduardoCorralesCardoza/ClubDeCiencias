package com.ccarreguin.ccarreguin.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDProyecto")
    private int idProyecto;

    @Column(name = "NombreProyecto")
    private String nombreProyecto;

    @Column(name = "Categoria")
    private String categoria;

    @ManyToOne
    @JoinColumn(name = "IDAsesorProyecto", referencedColumnName = "IDAsesor")
    private Asesores idAsesor;

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Asesores getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(Asesores idAsesor) {
        this.idAsesor = idAsesor;
    }
}
