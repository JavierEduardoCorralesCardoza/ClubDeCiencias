package com.ccarreguin.ccarreguin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccarreguin.ccarreguin.models.Ferias;
import com.ccarreguin.ccarreguin.services.FeriasServices;

@RestController
@RequestMapping("/ferias")
public class FeriasController {
    
    private final FeriasServices ferias_services;

    @Autowired
    public FeriasController(FeriasServices ferias_services){
        this.ferias_services = ferias_services;
    }

    @GetMapping
    public List<Ferias> getObtenerFerias(){
        return ferias_services.obtenerFerias();
    }
}
