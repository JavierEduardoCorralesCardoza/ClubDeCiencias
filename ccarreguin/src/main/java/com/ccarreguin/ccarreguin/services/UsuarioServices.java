package com.ccarreguin.ccarreguin.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccarreguin.ccarreguin.clases.Usuario;
import com.ccarreguin.ccarreguin.models.Alumnos;
import com.ccarreguin.ccarreguin.models.Asesores;
import com.ccarreguin.ccarreguin.repositories.entidades.AlumnosRepository;
import com.ccarreguin.ccarreguin.repositories.entidades.AsesoresRepository;

@Service
public class UsuarioServices {
    
    private final AlumnosRepository alumnos_repository;
    private final AsesoresRepository asesores_repository;

    @Autowired
    public UsuarioServices(AlumnosRepository alumnos_repository, AsesoresRepository asesores_repository) {
        this.alumnos_repository = alumnos_repository;
        this.asesores_repository = asesores_repository;
    }

    public boolean agregarUsuarios(Usuario usuario){
        Alumnos alumno_existente = alumnos_repository.findById(usuario.getCorreo()).orElse(null);
        Asesores asesor_existente = asesores_repository.findById(usuario.getCorreo()).orElse(null);
    
        if(alumno_existente == null && asesor_existente == null){
            if(usuario.getJerarquia().equals("alumno")){
                Alumnos alumno = new Alumnos(usuario.getCorreo(), usuario.getContrasena(), usuario.getNombre(), usuario.getImagen());
                alumnos_repository.save(alumno);
            }
            else{
                Asesores asesor = new Asesores(usuario.getCorreo(), usuario.getContrasena(), usuario.getNombre(), usuario.getImagen());
                asesores_repository.save(asesor);
            }
        }
        else{
            return false;
        }
    
        return true;
    }
    
    public List<String> ingresarUsuario(String correo){
        Alumnos alumno_existente = alumnos_repository.findById(correo).orElse(null);
        Asesores asesor_existente = asesores_repository.findById(correo).orElse(null);
    
        List<String> datos = new ArrayList<>();
    
        if(alumno_existente != null){
            datos.add(alumno_existente.getContrasena_alumno());
            datos.add("alumno");
            return datos;
        }
        else if(asesor_existente != null){
            datos.add(asesor_existente.getContrasena_asesor());
            datos.add("asesor");
            return datos;
        }
    
        return null;
    }
}
