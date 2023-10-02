package com.ccarreguin.ccarreguin.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AlumnoPorProyectoId implements Serializable {
    @Column(name = "IDAlumnoProyecto")
    private int idAlumnoCompuesto;

    @Column(name = "IDProyectoAlumno")
    private int idProyectoCompuesto;

    public int getIdAlumnoCompuesto() {
        return idAlumnoCompuesto;
    }

    public void setIdAlumnoCompuesto(int idAlumnoCompuesto) {
        this.idAlumnoCompuesto = idAlumnoCompuesto;
    }

    public int getIdProyectoCompuesto() {
        return idProyectoCompuesto;
    }

    public void setIdProyectoCompuesto(int idProyectoCompuesto) {
        this.idProyectoCompuesto = idProyectoCompuesto;
    }
}
