package com.ccarreguin.ccarreguin.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ferias")
public class Ferias {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDFeria")
    private int id_feria;

    @Column(name = "NombreFeria")
    private String nombre_feria;

    @Column(name = "Fecha")
    private String fecha;

    @OneToMany(mappedBy = "feria")
    private List<ProyectoPorFeria> proyectos;
    
    public Ferias() {
    }

    public Ferias(int id_feria, String nombre_feria, String fecha, List<ProyectoPorFeria> proyectos) {
        this.id_feria = id_feria;
        this.nombre_feria = nombre_feria;
        this.fecha = fecha;
        this.proyectos = proyectos;
    }

    public int getId_feria() {
        return id_feria;
    }

    public void setId_feria(int id_feria) {
        this.id_feria = id_feria;
    }

    public String getNombre_feria() {
        return nombre_feria;
    }

    public void setNombre_feria(String nombre_feria) {
        this.nombre_feria = nombre_feria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<ProyectoPorFeria> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<ProyectoPorFeria> proyectos) {
        this.proyectos = proyectos;
    }
}
