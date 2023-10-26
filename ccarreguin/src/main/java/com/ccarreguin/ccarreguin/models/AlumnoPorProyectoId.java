package com.ccarreguin.ccarreguin.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AlumnoPorProyectoId implements Serializable{

    @Column(name = "IDAlumnoProyecto")
    private int alumno_id;

    @Column(name = "IDProyectoAlumno")
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
