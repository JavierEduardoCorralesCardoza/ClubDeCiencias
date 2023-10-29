package com.ccarreguin.ccarreguin.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Proyectos")
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDProyecto")
    private int id_proyecto;

    @Column(name = "NombreProyecto")
    private String nombre_proyecto;

    @Column(name = "Categoria")
    private String categoria;

    @ManyToOne
    @JoinColumn(name = "IDAsesorProyecto", referencedColumnName = "IDAsesor")
    private Asesores asesor;

    @OneToMany(mappedBy = "proyecto")
    private List<AlumnoPorProyecto> alumnos;

    @OneToMany
    private List<ProyectoPorFeria> ferias;

    
    public Proyectos() {
    }

    public Proyectos(int id_proyecto, String nombre_proyecto, String categoria, Asesores asesor,
            List<AlumnoPorProyecto> alumnos, List<ProyectoPorFeria> ferias) {
        this.id_proyecto = id_proyecto;
        this.nombre_proyecto = nombre_proyecto;
        this.categoria = categoria;
        this.asesor = asesor;
        this.alumnos = alumnos;
        this.ferias = ferias;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Asesores getAsesor() {
        return asesor;
    }

    public void setAsesor(Asesores asesor) {
        this.asesor = asesor;
    }

    public List<AlumnoPorProyecto> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<AlumnoPorProyecto> alumnos) {
        this.alumnos = alumnos;
    }

    public List<ProyectoPorFeria> getFerias() {
        return ferias;
    }

    public void setFerias(List<ProyectoPorFeria> ferias) {
        this.ferias = ferias;
    }
}
