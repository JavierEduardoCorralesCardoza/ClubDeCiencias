package com.ccarreguin.ccarreguin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccarreguin.ccarreguin.models.ProyectoPorFeria;
import com.ccarreguin.ccarreguin.repositories.ProyectoPorFeriaRepository;

@Service
public class ProyectoPorFeriaServices {
    
    private final ProyectoPorFeriaRepository proyecto_feria_repository;

    @Autowired
    public ProyectoPorFeriaServices(ProyectoPorFeriaRepository proyecto_feria_repository){
        this.proyecto_feria_repository = proyecto_feria_repository;
    }

    public List<ProyectoPorFeria> obtenerProyectoPorFeria(){
        return proyecto_feria_repository.findAll();
    }
}
