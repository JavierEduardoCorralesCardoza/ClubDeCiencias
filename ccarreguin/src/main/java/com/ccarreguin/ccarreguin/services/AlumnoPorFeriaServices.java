package com.ccarreguin.ccarreguin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccarreguin.ccarreguin.models.AlumnoPorFeria;
import com.ccarreguin.ccarreguin.repositories.AlumnoPorFeriaRepository;

@Service
public class AlumnoPorFeriaServices {
    
    private final AlumnoPorFeriaRepository alumno_feria_repository;

    @Autowired
    public AlumnoPorFeriaServices(AlumnoPorFeriaRepository alumno_feria_repository){
        this.alumno_feria_repository = alumno_feria_repository;
    }

    public List<AlumnoPorFeria> obtenerAlumnoPorFeria(){
        return alumno_feria_repository.findAll();
    }
}
