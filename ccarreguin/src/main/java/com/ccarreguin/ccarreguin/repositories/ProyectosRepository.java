package com.ccarreguin.ccarreguin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccarreguin.ccarreguin.models.Proyectos;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Integer>{
    
}
