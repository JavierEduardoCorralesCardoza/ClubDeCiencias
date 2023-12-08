package com.ccarreguin.ccarreguin.controllers.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ccarreguin.ccarreguin.clases.Usuario;
import com.ccarreguin.ccarreguin.models.AlumnoPorProyecto;
import com.ccarreguin.ccarreguin.services.entidades.AlumnoPorProyectoServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/alumnoproyecto")
public class AlumnoPorProyectoController {
    
    private final AlumnoPorProyectoServices alumno_proyecto_services;

    @Autowired
    public AlumnoPorProyectoController(AlumnoPorProyectoServices alumno_proyecto_services){
        this.alumno_proyecto_services = alumno_proyecto_services;
    }

    @GetMapping("/proyectos")
    public ResponseEntity<List<AlumnoPorProyecto>> getProyectosDeAlumno(@RequestParam(value = "id") String id){
        List<AlumnoPorProyecto> res = alumno_proyecto_services.obtenerProyectosDeAlumno(id);

        return new ResponseEntity<List<AlumnoPorProyecto>>(res, HttpStatus.ACCEPTED);
    }

    @PostMapping("/postAP")
    public ResponseEntity<AlumnoPorProyecto> postAlumnoPorProyecto(@RequestBody AlumnoPorProyecto alumno_por_proyecto){

        alumno_proyecto_services.postAlumnoPorProyecto(alumno_por_proyecto);

        return new ResponseEntity<AlumnoPorProyecto>(alumno_por_proyecto, HttpStatus.ACCEPTED);
    }

}
