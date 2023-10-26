package com.ccarreguin.ccarreguin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccarreguin.ccarreguin.models.ProyectoPorFeria;
import com.ccarreguin.ccarreguin.services.ProyectoPorFeriaServices;

@RestController
@RequestMapping("/proyectoferia")
public class ProyectoPorFeriaController {
    
    private final ProyectoPorFeriaServices proyecto_feria_services;

    @Autowired
    public ProyectoPorFeriaController(ProyectoPorFeriaServices proyecto_feria_services){
        this.proyecto_feria_services = proyecto_feria_services;
    }

    @GetMapping
    public List<ProyectoPorFeria> getObtenerProyectoPorFeria(){
        return proyecto_feria_services.obtenerProyectoPorFeria();
    }
}
