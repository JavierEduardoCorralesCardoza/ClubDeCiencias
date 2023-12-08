package com.ccarreguin.ccarreguin.services.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccarreguin.ccarreguin.models.Proyectos;
import com.ccarreguin.ccarreguin.repositories.entidades.ProyectosRepository;

@Service
public class ProyectosServices {

    private final ProyectosRepository proyectos_repository;

    @Autowired
    public ProyectosServices(ProyectosRepository proyectos_repository){
        this.proyectos_repository = proyectos_repository;
    }

    public List<Proyectos> obtenerProyectos(){
        return proyectos_repository.findAll();
    }

    public Proyectos getProyecto(int id){
        return proyectos_repository.findById(id).orElse(null);
    }
}
