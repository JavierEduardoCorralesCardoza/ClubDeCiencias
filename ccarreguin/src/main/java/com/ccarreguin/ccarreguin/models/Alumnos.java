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
@Table(name = "Alumnos")
public class Alumnos {
    
    @Id
    @Column(name = "CorreoAlumno")
    private String correo_alumno;

    @Column(name = "ContrasenaAlumno")
    private String contrasena_alumno;

    @Column(name = "NombreAlumno")
    private String nombre_alumno;

    @Column(name = "ImagenAlumno")
    private String imagen_alumno;

    @OneToMany(mappedBy = "alumno")
    private List<AlumnoPorProyecto> proyectos;

    @OneToMany(mappedBy = "alumno")
    private List<AlumnoPorFeria> ferias;

    public Alumnos() {
    }
    
    public Alumnos(String correo_alumno, String contrasena_alumno, String nombre_alumno, String imagen_alumno) {
        this.correo_alumno = correo_alumno;
        this.contrasena_alumno = contrasena_alumno;
        this.nombre_alumno = nombre_alumno;
        this.imagen_alumno = imagen_alumno;
    }

    public Alumnos(String correo_alumno, String contrasena_alumno, String nombre_alumno,
            String imagen_alumno, List<AlumnoPorProyecto> proyectos, List<AlumnoPorFeria> ferias) {
        this.correo_alumno = correo_alumno;
        this.contrasena_alumno = contrasena_alumno;
        this.nombre_alumno = nombre_alumno;
        this.imagen_alumno = imagen_alumno;
        this.proyectos = proyectos;
        this.ferias = ferias;
    }

    public String getCorreo_alumno() {
        return correo_alumno;
    }

    public void setCorreo_alumno(String correo_alumno) {
        this.correo_alumno = correo_alumno;
    }

    public String getContrasena_alumno() {
        return contrasena_alumno;
    }

    public void setContrasena_alumno(String contrasena_alumno) {
        this.contrasena_alumno = contrasena_alumno;
    }

    public String getImagen_alumno() {
        return imagen_alumno;
    }

    public void setImagen_alumno(String imagen_alumno) {
        this.imagen_alumno = imagen_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public List<AlumnoPorProyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<AlumnoPorProyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public List<AlumnoPorFeria> getFerias() {
        return ferias;
    }

    public void setFerias(List<AlumnoPorFeria> ferias) {
        this.ferias = ferias;
    }
}
