package com.ccarreguin.ccarreguin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccarreguin.ccarreguin.models.AlumnoPorProyecto;
import com.ccarreguin.ccarreguin.repositories.AlumnoPorProyectoRepository;

@Service
public class AlumnoPorProyectoServices {

    private final AlumnoPorProyectoRepository alumno_proyecto_repository;

    @Autowired
    public AlumnoPorProyectoServices(AlumnoPorProyectoRepository alumno_proyecto_repository){
        this.alumno_proyecto_repository = alumno_proyecto_repository;
    }

    public List<AlumnoPorProyecto> obtenerAlumnoPorProyecto(){
        return alumno_proyecto_repository.findAll();
    }
}
