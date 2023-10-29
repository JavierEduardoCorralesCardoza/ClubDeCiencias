package com.ccarreguin.ccarreguin.controllers.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccarreguin.ccarreguin.models.AlumnoPorProyecto;
import com.ccarreguin.ccarreguin.services.entidades.AlumnoPorProyectoServices;

@RestController
@RequestMapping("/alumnoproyecto")
public class AlumnoPorProyectoController {
    
    private final AlumnoPorProyectoServices alumno_proyecto_services;

    @Autowired
    public AlumnoPorProyectoController(AlumnoPorProyectoServices alumno_proyecto_services){
        this.alumno_proyecto_services = alumno_proyecto_services;
    }

    @GetMapping
    public List<AlumnoPorProyecto> getObtenerAlumnoPorProyecto(){
        return alumno_proyecto_services.obtenerAlumnoPorProyecto();
    }
}
