package com.ccarreguin.ccarreguin.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class AlumnoPorProyectoId implements Serializable{
    private int alumno_id;
    private int proyecto_id;
    
    public int getAlumno_id() {
        return alumno_id;
    }
    public void setAlumno_id(int alumno_id) {
        this.alumno_id = alumno_id;
    }
    public int getProyecto_id() {
        return proyecto_id;
    }
    public void setProyecto_id(int proyecto_id) {
        this.proyecto_id = proyecto_id;
    }
}
