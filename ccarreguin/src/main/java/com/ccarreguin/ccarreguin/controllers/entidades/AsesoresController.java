package com.ccarreguin.ccarreguin.controllers.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccarreguin.ccarreguin.models.Asesores;
import com.ccarreguin.ccarreguin.services.entidades.AsesoresServices;

@RestController
@RequestMapping("/asesores")
public class AsesoresController {

    private final AsesoresServices asesores_services;

    @Autowired
    public AsesoresController(AsesoresServices asesores_services){
        this.asesores_services = asesores_services;
    }

    @GetMapping
    public List<Asesores> getObtenerAsesores(){
        return asesores_services.obtenerAsesores();
    }
}
