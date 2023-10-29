package com.ccarreguin.ccarreguin.repositories.entidades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccarreguin.ccarreguin.models.ProyectoPorFeria;
import com.ccarreguin.ccarreguin.models.ProyectoPorFeriaId;

@Repository
public interface ProyectoPorFeriaRepository extends JpaRepository<ProyectoPorFeria, ProyectoPorFeriaId>{
    
}
