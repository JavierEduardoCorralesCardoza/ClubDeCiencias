package com.ccarreguin.ccarreguin.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Apoyos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDApoyo")
    private int idApoyo;

    @Column(name = "Patrocinador")
    private String patrocinador;

    @Column(name = "ApoyoOtorgado")
    private String apoyoOtorgado;

    public int getIdApoyo() {
        return idApoyo;
    }

    public void setIdApoyo(int idApoyo) {
        this.idApoyo = idApoyo;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public String getApoyoOtorgado() {
        return apoyoOtorgado;
    }

    public void setApoyoOtorgado(String apoyoOtorgado) {
        this.apoyoOtorgado = apoyoOtorgado;
    }
}
