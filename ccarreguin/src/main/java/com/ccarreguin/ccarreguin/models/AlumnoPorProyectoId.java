package com.ccarreguin.ccarreguin.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AlumnoPorProyectoId implements Serializable{

    @Column(name = "IDAlumnoProyecto")
    private String alumno_correo;

    @Column(name = "IDProyectoAlumno")
    private int proyecto_id;
    
    public String getAlumno_correo() {
        return alumno_correo;
    }
    public void setAlumno_correo(String alumno_correo) {
        this.alumno_correo = alumno_correo;
    }
    public int getProyecto_id() {
        return proyecto_id;
    }
    public void setProyecto_id(int proyecto_id) {
        this.proyecto_id = proyecto_id;
    }
}
