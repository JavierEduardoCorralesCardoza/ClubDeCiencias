package com.ccarreguin.ccarreguin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccarreguin.ccarreguin.models.AlumnoPorProyecto;
import com.ccarreguin.ccarreguin.models.AlumnoPorProyectoId;

public interface AlumnoPorProyectoRepository extends JpaRepository<AlumnoPorProyecto, AlumnoPorProyectoId>{
    
}
