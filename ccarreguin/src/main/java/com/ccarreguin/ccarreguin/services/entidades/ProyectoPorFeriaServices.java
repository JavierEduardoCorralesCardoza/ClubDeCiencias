package com.ccarreguin.ccarreguin.services.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccarreguin.ccarreguin.models.ProyectoPorFeria;
import com.ccarreguin.ccarreguin.repositories.entidades.ProyectoPorFeriaRepository;

@Service
public class ProyectoPorFeriaServices {
    
    private final ProyectoPorFeriaRepository proyecto_feria_repository;

    @Autowired
    public ProyectoPorFeriaServices(ProyectoPorFeriaRepository proyecto_feria_repository){
        this.proyecto_feria_repository = proyecto_feria_repository;
    }

    public List<ProyectoPorFeria> obtenerProyectoPorFeria(){
        return proyecto_feria_repository.findAll();
    }

    public boolean postProyectoPorFeria(ProyectoPorFeria proyecto_por_feria){

        proyecto_feria_repository.save(proyecto_por_feria);

        return true;
    }
}
