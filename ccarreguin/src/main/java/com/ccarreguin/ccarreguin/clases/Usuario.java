package com.ccarreguin.ccarreguin.clases;

public class Usuario {
    private String correo;
    private String contrasena;
    private String nombre;
    private String imagen;
    private String jerarquia;

    public Usuario() {
    }

    public Usuario(String correo, String contrasena, String nombre, String imagen, String jerarquia) {
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.imagen = imagen;
        this.jerarquia = jerarquia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getJerarquia() {
        return jerarquia;
    }

    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }

    
}
