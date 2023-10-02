package com.ccarreguin.ccarreguin.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class AlumnoPorProyecto {

    @EmbeddedId
    private AlumnoPorProyectoId id;

    @ManyToOne
    @MapsId("idAlumnoCompuesto")
    private Alumnos alumno;

    @ManyToOne
    @MapsId("idProyectoCompuesto")
    private Proyectos proyecto;

    public AlumnoPorProyectoId getId() {
        return id;
    }

    public void setId(AlumnoPorProyectoId id) {
        this.id = id;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public Proyectos getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyectos proyecto) {
        this.proyecto = proyecto;
    }
}
