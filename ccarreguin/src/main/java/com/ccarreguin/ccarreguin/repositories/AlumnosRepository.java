package com.ccarreguin.ccarreguin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccarreguin.ccarreguin.models.Alumnos;

public interface AlumnosRepository extends JpaRepository<Alumnos, Integer>{
    
}
