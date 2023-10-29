package com.ccarreguin.ccarreguin.repositories.entidades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccarreguin.ccarreguin.models.Ferias;

@Repository
public interface FeriasRepository extends JpaRepository<Ferias, Integer>{
    
}
