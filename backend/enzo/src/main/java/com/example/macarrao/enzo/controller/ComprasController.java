package com.example.macarrao.enzo.controller;

import com.example.macarrao.enzo.model.Compras;
import com.example.macarrao.enzo.repository.ComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compras")
public class ComprasController {

    private ComprasRepository comprasRepository;

    @Autowired
    public ComprasController(ComprasRepository comprasRepository) {
        this.comprasRepository = comprasRepository;
    }

    @PostMapping
    @RequestMapping
    public Compras criarCompra (@RequestBody Compras novaCompra) {
        return comprasRepository.save(novaCompra);
    }





}
