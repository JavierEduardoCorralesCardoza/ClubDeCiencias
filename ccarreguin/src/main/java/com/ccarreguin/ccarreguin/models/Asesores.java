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
    @Column(name = "CorreoAsesor")
    private String correoAsesor;

    @Column(name = "ContrasenaAsesor")
    private String contrasena_asesor;

    @Column(name = "NombreAsesor")
    private String nombre_asesor;

    @Column(name = "ImagenAsesor")
    private String imagen_asesor;

    @OneToMany(mappedBy = "asesor")
    private List<Proyectos> proyectos;
    
    public Asesores() {
    }

    public Asesores(String correoAsesor, String contrasena_asesor, String nombre_asesor, String imagen_asesor) {
        this.correoAsesor = correoAsesor;
        this.contrasena_asesor = contrasena_asesor;
        this.nombre_asesor = nombre_asesor;
        this.imagen_asesor = imagen_asesor;
    }

    public Asesores(String correoAsesor, String contrasena_asesor, String nombre_asesor,
            String imagen_asesor, List<Proyectos> proyectos) {
        this.correoAsesor = correoAsesor;
        this.contrasena_asesor = contrasena_asesor;
        this.nombre_asesor = nombre_asesor;
        this.imagen_asesor = imagen_asesor;
        this.proyectos = proyectos;
    }

    public String getCorreoAsesor() {
        return correoAsesor;
    }

    public void setCorreoAsesor(String correoAsesor) {
        this.correoAsesor = correoAsesor;
    }

    public String getContrasena_asesor() {
        return contrasena_asesor;
    }

    public void setContrasena_asesor(String contrasena_asesor) {
        this.contrasena_asesor = contrasena_asesor;
    }

    public String getImagen_asesor() {
        return imagen_asesor;
    }

    public void setImagen_asesor(String imagen_asesor) {
        this.imagen_asesor = imagen_asesor;
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
