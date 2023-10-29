package com.ccarreguin.ccarreguin.repositories.entidades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccarreguin.ccarreguin.models.Apoyos;

@Repository
public interface ApoyosRepository extends JpaRepository<Apoyos, Integer>{
    
}
