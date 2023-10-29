package com.ccarreguin.ccarreguin.controllers.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccarreguin.ccarreguin.models.Apoyos;
import com.ccarreguin.ccarreguin.services.entidades.ApoyosServices;

@RestController
@RequestMapping("/apoyos")
public class ApoyosController {
    
    private final ApoyosServices apoyos_services;

    @Autowired
    public ApoyosController(ApoyosServices apoyos_services){
        this.apoyos_services = apoyos_services;
    }

    @GetMapping
    public List<Apoyos> getObtenerApoyos(){
        return apoyos_services.obtenerApoyos();
    }
}
