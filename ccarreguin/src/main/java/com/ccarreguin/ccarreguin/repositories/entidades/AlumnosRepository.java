package com.ccarreguin.ccarreguin.repositories.entidades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ccarreguin.ccarreguin.models.Alumnos;

@Repository
public interface AlumnosRepository extends JpaRepository<Alumnos, String>{
}
