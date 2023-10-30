package com.ccarreguin.ccarreguin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ccarreguin.ccarreguin.clases.Autenticacion;
import com.ccarreguin.ccarreguin.clases.Usuario;
import com.ccarreguin.ccarreguin.services.UsuarioServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/home")
public class homeController {

    private final UsuarioServices usuario_services;

    @Autowired
    public homeController(UsuarioServices usuario_services) {
        this.usuario_services = usuario_services;
    }

    @PostMapping("/signup")
    public ResponseEntity<Usuario> signup(@RequestBody Usuario usuario){
        boolean status = usuario_services.agregarUsuarios(usuario);

        if(status){
            return new ResponseEntity<Usuario>(usuario, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<Usuario>(usuario, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/signin")
    public ResponseEntity<List<String>> signin(@RequestParam(value = "correo") String correo, @RequestParam(value = "contrasena") String contrasena){
        List<String> res = usuario_services.ingresarUsuario(correo);

        if(res.get(0).equals(contrasena)){
            return new ResponseEntity<List<String>>(res, HttpStatus.ACCEPTED);
        }

        return new ResponseEntity<List<String>>(res, HttpStatus.BAD_REQUEST);
    }
}
