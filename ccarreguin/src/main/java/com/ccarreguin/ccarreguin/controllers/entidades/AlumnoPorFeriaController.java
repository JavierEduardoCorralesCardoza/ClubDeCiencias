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
import org.springframework.web.bind.annotation.RestController;

import com.ccarreguin.ccarreguin.models.AlumnoPorFeria;
import com.ccarreguin.ccarreguin.models.AlumnoPorProyecto;
import com.ccarreguin.ccarreguin.models.Alumnos;
import com.ccarreguin.ccarreguin.models.Ferias;
import com.ccarreguin.ccarreguin.services.entidades.AlumnoPorFeriaServices;
import com.ccarreguin.ccarreguin.services.entidades.AlumnosServices;
import com.ccarreguin.ccarreguin.services.entidades.FeriasServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/alumnoferia")
public class AlumnoPorFeriaController {
    
    private final AlumnoPorFeriaServices alumno_feria_services;
    private final AlumnosServices alumno_services;
    private final FeriasServices ferias_services;

    @Autowired
    public AlumnoPorFeriaController(AlumnoPorFeriaServices alumno_feria_services, AlumnosServices alumno_services, FeriasServices ferias_services){
        this.alumno_feria_services = alumno_feria_services;
        this.alumno_services = alumno_services;
        this.ferias_services = ferias_services;
    }

    @PostMapping("/postAlumnoPorFeria")
    public ResponseEntity<AlumnoPorFeria> postAlumnoPorFeria(@RequestBody AlumnoPorFeria alumno_por_feria){
        Alumnos alumno = alumno_services.getInfoAlumno(alumno_por_feria.getId().getAlumno_id());
        alumno_por_feria.setAlumno(alumno);

        Ferias feria = ferias_services.getFeria(alumno_por_feria.getId().getFeria_id());
        alumno_por_feria.setFeria(feria);
        
        alumno_feria_services.postAlumnoPorFeria(alumno_por_feria);

        return new ResponseEntity<AlumnoPorFeria>(alumno_por_feria, HttpStatus.ACCEPTED);
    }
}
