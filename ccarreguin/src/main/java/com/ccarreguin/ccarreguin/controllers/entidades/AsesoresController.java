package com.ccarreguin.ccarreguin.controllers.entidades;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccarreguin.ccarreguin.models.Asesores;
import com.ccarreguin.ccarreguin.services.entidades.AsesoresServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/asesores")
public class AsesoresController {
    
    private final AsesoresServices asesores_services;

    public AsesoresController(AsesoresServices asesores_services) {
        this.asesores_services = asesores_services;
    }

    @GetMapping("/getAsesores")
    public ResponseEntity<List<Asesores>> getAsesores(){
        List<Asesores> res = asesores_services.getAsesores();
        
        return new ResponseEntity<List<Asesores>>(res, HttpStatus.ACCEPTED);
    }
}
