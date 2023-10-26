package com.ccarreguin.ccarreguin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccarreguin.ccarreguin.models.AlumnoPorProyecto;
import com.ccarreguin.ccarreguin.models.AlumnoPorProyectoId;

@Repository
public interface AlumnoPorProyectoRepository extends JpaRepository<AlumnoPorProyecto, AlumnoPorProyectoId>{
    
}
