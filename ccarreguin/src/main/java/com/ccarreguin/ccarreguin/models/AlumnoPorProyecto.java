package com.ccarreguin.ccarreguin.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "AlumnoPorProyecto")
public class AlumnoPorProyecto {

    @EmbeddedId
    private AlumnoPorProyectoId id;

    @ManyToOne
    @MapsId("alumno_id")
    @JoinColumn(name = "IDAlumnoProyecto", referencedColumnName = "IDAlumno")
    private Alumnos alumno;

    @ManyToOne
    @MapsId("proyecto_id")
    @JoinColumn(name = "IDProyectoAlumno", referencedColumnName = "IDProyecto")
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
