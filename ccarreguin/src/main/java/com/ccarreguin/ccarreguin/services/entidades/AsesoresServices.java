package com.ccarreguin.ccarreguin.services.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccarreguin.ccarreguin.models.Asesores;
import com.ccarreguin.ccarreguin.repositories.entidades.AsesoresRepository;

@Service
public class AsesoresServices {
    
    private final AsesoresRepository asesores_repository;

    @Autowired
    public AsesoresServices(AsesoresRepository asesores_repository){
        this.asesores_repository = asesores_repository;
    }

    public List<Asesores> obtenerAsesores(){
        return asesores_repository.findAll();
    }
}
