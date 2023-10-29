package com.ccarreguin.ccarreguin.services.entidades;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccarreguin.ccarreguin.models.Alumnos;
import com.ccarreguin.ccarreguin.repositories.entidades.AlumnosRepository;

@Service
public class AlumnosServices {

    private final AlumnosRepository alumnos_repository;

    @Autowired
    public AlumnosServices(AlumnosRepository alumnos_repository){
        this.alumnos_repository = alumnos_repository;
    }
    
    public List<Alumnos> obtenerAlumnos(){
        return alumnos_repository.findAll();
    }
}
