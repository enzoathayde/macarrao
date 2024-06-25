package com.example.macarrao.enzo.controller;

import com.example.macarrao.enzo.model.Estoque;
import com.example.macarrao.enzo.repository.EstoqueRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    private EstoqueRepository estoqueRepository;

    @GetMapping
    public List<Estoque> apresentarEstoque () {
        return estoqueRepository.findAll();
    }

}
