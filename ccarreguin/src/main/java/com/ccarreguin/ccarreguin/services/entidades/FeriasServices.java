package com.ccarreguin.ccarreguin.services.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccarreguin.ccarreguin.models.Ferias;
import com.ccarreguin.ccarreguin.repositories.entidades.FeriasRepository;

@Service
public class FeriasServices {
    
    private final FeriasRepository ferias_repository;

    @Autowired
    public FeriasServices(FeriasRepository ferias_repository){
        this.ferias_repository = ferias_repository;
    }

    public List<Ferias> obtenerFerias(){
        return ferias_repository.findAll();
    }

    public Ferias getFeria(int id){
        return ferias_repository.findById(id).orElse(null);
    }
}
