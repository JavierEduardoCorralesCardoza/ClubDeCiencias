package com.ccarreguin.ccarreguin.repositories.entidades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccarreguin.ccarreguin.models.AlumnoPorFeria;
import com.ccarreguin.ccarreguin.models.AlumnoPorFeriaId;

@Repository
public interface AlumnoPorFeriaRepository extends JpaRepository<AlumnoPorFeria, AlumnoPorFeriaId>{
    
}
