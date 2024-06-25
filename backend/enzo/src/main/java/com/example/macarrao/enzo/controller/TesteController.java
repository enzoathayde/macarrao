package com.example.macarrao.enzo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testes")
public class TesteController {

    @GetMapping
    public String retorno () { return "Funcionando!"; }
}
