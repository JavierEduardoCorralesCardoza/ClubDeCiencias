package com.ccarreguin.ccarreguin.clases;

public class Autenticacion {
    String correo;
    String contrasena;
    
    public Autenticacion() {
    }

    public Autenticacion(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
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
    
}
