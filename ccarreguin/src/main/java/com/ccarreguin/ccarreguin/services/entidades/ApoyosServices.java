package com.ccarreguin.ccarreguin.services.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccarreguin.ccarreguin.models.Apoyos;
import com.ccarreguin.ccarreguin.repositories.entidades.ApoyosRepository;

@Service
public class ApoyosServices {
    
    private final ApoyosRepository apoyos_repository;

    @Autowired
    public ApoyosServices(ApoyosRepository apoyos_repository){
        this.apoyos_repository = apoyos_repository;
    }

    public List<Apoyos> obtenerApoyos(){
        return apoyos_repository.findAll();
    }
}
