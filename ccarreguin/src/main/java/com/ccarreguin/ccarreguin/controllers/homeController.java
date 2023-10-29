package com.ccarreguin.ccarreguin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ccarreguin.ccarreguin.clases.Autenticacion;
import com.ccarreguin.ccarreguin.clases.Usuario;
import com.ccarreguin.ccarreguin.services.UsuarioServices;

@Controller
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
    public ResponseEntity<Boolean> signin(@RequestBody Autenticacion auth){
        String res = usuario_services.ingresarUsuario(auth.getCorreo());

        if(res.equals(auth.getContrasena())){
            return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
        }

        return new ResponseEntity<Boolean>(false, HttpStatus.BAD_REQUEST);
    }
}
