package com.ccarreguin.ccarreguin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccarreguin.ccarreguin.models.ProyectoPorFeria;
import com.ccarreguin.ccarreguin.models.ProyectoPorFeriaId;

public interface ProyectoPorFeriaRepository extends JpaRepository<ProyectoPorFeria, ProyectoPorFeriaId>{
    
}
