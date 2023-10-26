package com.ccarreguin.ccarreguin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccarreguin.ccarreguin.models.AlumnoPorFeria;
import com.ccarreguin.ccarreguin.services.AlumnoPorFeriaServices;

@RestController
@RequestMapping("/alumnoferia")
public class AlumnoPorFeriaController {
    
    private final AlumnoPorFeriaServices alumno_feria_services;

    @Autowired
    public AlumnoPorFeriaController(AlumnoPorFeriaServices alumno_feria_services){
        this.alumno_feria_services = alumno_feria_services;
    }

    @GetMapping
    public List<AlumnoPorFeria> getObtenerAlumnoPorFeria(){
        return alumno_feria_services.obtenerAlumnoPorFeria();
    }
}
