package com.ccarreguin.ccarreguin.repositories.entidades;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ccarreguin.ccarreguin.models.AlumnoPorProyecto;
import com.ccarreguin.ccarreguin.models.AlumnoPorProyectoId;

@Repository
public interface AlumnoPorProyectoRepository extends JpaRepository<AlumnoPorProyecto, AlumnoPorProyectoId>{

    @Query("SELECT app FROM AlumnoPorProyecto app WHERE app.id.alumno_correo = :correo")
    List<AlumnoPorProyecto> findProyectosByCorreoAlumno(@Param("correo") String correo);
}
