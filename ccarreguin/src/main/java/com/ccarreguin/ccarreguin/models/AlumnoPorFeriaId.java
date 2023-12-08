package com.ccarreguin.ccarreguin.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AlumnoPorFeriaId implements Serializable{

    @Column(name = "IDAlumnoFeria")
    private String alumno_correo;

    @Column(name = "IDFeriaAlumno")
    private int feria_id;
    
    public String getAlumno_id() {
        return alumno_correo;
    }
    public void setAlumno_id(String alumno_correo) {
        this.alumno_correo = alumno_correo;
    }
    public int getFeria_id() {
        return feria_id;
    }
    public void setFeria_id(int feria_id) {
        this.feria_id = feria_id;
    }
}
