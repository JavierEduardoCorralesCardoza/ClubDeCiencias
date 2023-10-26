package com.ccarreguin.ccarreguin.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class AlumnoPorFeriaId implements Serializable{
    private int alumno_id;
    private int feria_id;
    
    public int getAlumno_id() {
        return alumno_id;
    }
    public void setAlumno_id(int alumno_id) {
        this.alumno_id = alumno_id;
    }
    public int getFeria_id() {
        return feria_id;
    }
    public void setFeria_id(int feria_id) {
        this.feria_id = feria_id;
    }
}
