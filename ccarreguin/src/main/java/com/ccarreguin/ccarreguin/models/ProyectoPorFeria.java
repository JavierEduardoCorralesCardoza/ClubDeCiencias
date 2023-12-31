package com.ccarreguin.ccarreguin.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProyectoPorFeria")
public class ProyectoPorFeria {

    @EmbeddedId
    private ProyectoPorFeriaId id;

    @ManyToOne
    @MapsId("proyecto_id")
    @JoinColumn(name = "IDProyectoFeria", referencedColumnName = "IDProyecto")
    private Proyectos proyecto;

    @ManyToOne
    @MapsId("feria_id")
    @JoinColumn(name = "IDFeriaProyecto", referencedColumnName = "IDFeria")
    private Ferias feria;
    
    public ProyectoPorFeria() {
    }

    public ProyectoPorFeria(ProyectoPorFeriaId id, Proyectos proyecto, Ferias feria) {
        this.id = id;
        this.proyecto = proyecto;
        this.feria = feria;
    }

    public ProyectoPorFeriaId getId() {
        return id;
    }

    public void setId(ProyectoPorFeriaId id) {
        this.id = id;
    }

    public Proyectos getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyectos proyecto) {
        this.proyecto = proyecto;
    }

    public Ferias getFeria() {
        return feria;
    }

    public void setFeria(Ferias feria) {
        this.feria = feria;
    }
}
