package com.ccarreguin.ccarreguin.controllers.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccarreguin.ccarreguin.models.Proyectos;
import com.ccarreguin.ccarreguin.services.entidades.ProyectosServices;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {
    
    private final ProyectosServices proyectos_services;

    @Autowired
    public ProyectosController(ProyectosServices proyectos_services){
        this.proyectos_services = proyectos_services;
    }

    @GetMapping
    public List<Proyectos> getObtenerProyectos(){
        return proyectos_services.obtenerProyectos();
    }
}
