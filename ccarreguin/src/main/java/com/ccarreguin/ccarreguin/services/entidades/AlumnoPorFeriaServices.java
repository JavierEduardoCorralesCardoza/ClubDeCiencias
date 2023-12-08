package com.ccarreguin.ccarreguin.services.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccarreguin.ccarreguin.models.AlumnoPorFeria;
import com.ccarreguin.ccarreguin.repositories.entidades.AlumnoPorFeriaRepository;

@Service
public class AlumnoPorFeriaServices {
    
    private final AlumnoPorFeriaRepository alumno_feria_repository;

    @Autowired
    public AlumnoPorFeriaServices(AlumnoPorFeriaRepository alumno_feria_repository){
        this.alumno_feria_repository = alumno_feria_repository;
    }

    public boolean postAlumnoPorFeria(AlumnoPorFeria alumno_por_feria){

        alumno_feria_repository.save(alumno_por_feria);

        return true;
    }
}
