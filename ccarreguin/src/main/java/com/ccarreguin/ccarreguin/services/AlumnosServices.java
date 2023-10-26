package com.ccarreguin.ccarreguin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccarreguin.ccarreguin.models.Alumnos;
import com.ccarreguin.ccarreguin.repositories.AlumnosRepository;

@Service
public class AlumnosServices {

    private final AlumnosRepository alumnos_repository;

    @Autowired
    public AlumnosServices(AlumnosRepository alumnos_repository){
        this.alumnos_repository = alumnos_repository;
    }

    public Alumnos agregarAlumnos(Alumnos alumno){
        return alumnos_repository.save(alumno);
    }

    public List<Alumnos> obtenerAlumnos(){
        return alumnos_repository.findAll();
    }
}
