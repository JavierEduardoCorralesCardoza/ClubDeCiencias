package com.ccarreguin.ccarreguin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
    
    @GetMapping
    public String logIn(){
        return "";
    }
}
