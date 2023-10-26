package com.ccarreguin.ccarreguin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccarreguin.ccarreguin.models.Asesores;

@Repository
public interface AsesoresRepository extends JpaRepository<Asesores, Integer>{
    
}
