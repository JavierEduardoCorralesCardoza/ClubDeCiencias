package com.ccarreguin.ccarreguin.controllers.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ccarreguin.ccarreguin.models.Alumnos;
import com.ccarreguin.ccarreguin.services.entidades.AlumnosServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/alumno")
public class AlumnosController {
    
    private final AlumnosServices alumno_services;

    @Autowired
    public AlumnosController(AlumnosServices alumno_services) {
        this.alumno_services = alumno_services;
    }
    
    @GetMapping("/infoAlumno")
    public ResponseEntity<Alumnos> getAlumno(@RequestParam(value = "id") String id){
        Alumnos res = alumno_services.getInfoAlumno(id);

        return new ResponseEntity<Alumnos>(res, HttpStatus.ACCEPTED);
    }
}
