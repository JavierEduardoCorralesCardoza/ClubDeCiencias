package com.ccarreguin.ccarreguin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccarreguin.ccarreguin.models.Alumnos;
import com.ccarreguin.ccarreguin.services.AlumnosServices;

@RestController
@RequestMapping("/alumnos")
public class AlumnosController {
    
    private final AlumnosServices alumnos_services;

    @Autowired
    public AlumnosController(AlumnosServices alumnos_services){
        this.alumnos_services = alumnos_services;
    }

    @GetMapping
    public List<Alumnos> getObtenerAlumnos(){
        return alumnos_services.obtenerAlumnos();
    }
}
