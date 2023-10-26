package com.ccarreguin.ccarreguin.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class ProyectoPorFeriaId implements Serializable{
    private int proyecto_id;
    private int feria_id;
    
    public int getProyecto_id() {
        return proyecto_id;
    }
    public void setProyecto_id(int proyecto_id) {
        this.proyecto_id = proyecto_id;
    }
    public int getFeria_id() {
        return feria_id;
    }
    public void setFeria_id(int feria_id) {
        this.feria_id = feria_id;
    }
}
