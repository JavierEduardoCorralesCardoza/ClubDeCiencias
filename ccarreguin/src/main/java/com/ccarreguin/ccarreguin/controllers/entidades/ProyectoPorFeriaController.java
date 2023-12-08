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

import com.ccarreguin.ccarreguin.models.Ferias;
import com.ccarreguin.ccarreguin.models.ProyectoPorFeria;
import com.ccarreguin.ccarreguin.models.Proyectos;
import com.ccarreguin.ccarreguin.services.entidades.FeriasServices;
import com.ccarreguin.ccarreguin.services.entidades.ProyectoPorFeriaServices;
import com.ccarreguin.ccarreguin.services.entidades.ProyectosServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/proyectoferia")
public class ProyectoPorFeriaController {
    
    private final ProyectoPorFeriaServices proyecto_feria_services;
    private final ProyectosServices proyectos_Services;
    private final FeriasServices ferias_services;

    @Autowired
    public ProyectoPorFeriaController(ProyectoPorFeriaServices proyecto_feria_services,
            ProyectosServices proyectos_Services, FeriasServices ferias_services) {
        this.proyecto_feria_services = proyecto_feria_services;
        this.proyectos_Services = proyectos_Services;
        this.ferias_services = ferias_services;
    }

    @PostMapping("/postProyectoPorFeria")
    public ResponseEntity<ProyectoPorFeria> postProyectoPorFeria(@RequestBody ProyectoPorFeria proyecto_por_feria){

        Proyectos proyecto = proyectos_Services.getProyecto(proyecto_por_feria.getId().getProyecto_id());
        proyecto_por_feria.setProyecto(proyecto);

        Ferias feria = ferias_services.getFeria(proyecto_por_feria.getId().getFeria_id());
        proyecto_por_feria.setFeria(feria);

        proyecto_feria_services.postProyectoPorFeria(proyecto_por_feria);

        return new ResponseEntity<ProyectoPorFeria>(proyecto_por_feria, HttpStatus.ACCEPTED);
    }
}
