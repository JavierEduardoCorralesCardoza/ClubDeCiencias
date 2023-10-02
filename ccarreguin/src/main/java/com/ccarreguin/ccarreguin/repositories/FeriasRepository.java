package com.ccarreguin.ccarreguin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccarreguin.ccarreguin.models.Ferias;

public interface FeriasRepository extends JpaRepository<Ferias, Integer>{
    
}
