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
@Table(name = "Asesores")
public class Asesores {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDAsesor")
    private int id_asesores;

    @Column(name = "NombreAsesor")
    private String nombre_asesor;

    @OneToMany(mappedBy = "asesor")
    private List<Proyectos> proyectos;

    public int getId_asesores() {
        return id_asesores;
    }

    public void setId_asesores(int id_asesores) {
        this.id_asesores = id_asesores;
    }

    public String getNombre_asesor() {
        return nombre_asesor;
    }

    public void setNombre_asesor(String nombre_asesor) {
        this.nombre_asesor = nombre_asesor;
    }

    public List<Proyectos> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyectos> proyectos) {
        this.proyectos = proyectos;
    }
}
