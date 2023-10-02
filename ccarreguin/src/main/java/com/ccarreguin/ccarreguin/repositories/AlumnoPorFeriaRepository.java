package com.ccarreguin.ccarreguin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccarreguin.ccarreguin.models.AlumnoPorFeria;
import com.ccarreguin.ccarreguin.models.AlumnoPorFeriaId;

public interface AlumnoPorFeriaRepository extends JpaRepository<AlumnoPorFeria, AlumnoPorFeriaId>{
    
}
