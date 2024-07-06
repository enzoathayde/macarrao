package com.example.macarrao.enzo.controller;

import com.example.macarrao.enzo.model.Produtos;
import com.example.macarrao.enzo.repository.ProdutosRepository;
import jakarta.persistence.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
//@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutosController {

    private ProdutosRepository produtosRepository;

    @Autowired
    public ProdutosController(ProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }

    @PostMapping
    @RequestMapping("/produtos")
    public Produtos criarProduto (@RequestBody Produtos novoProduto) {
        return produtosRepository.save(novoProduto);
    }

    @GetMapping
    @RequestMapping("/soma")
    public String somaProdutos () {
        List<Produtos> produtos = produtosRepository.findAll();
        int somaProdutos = 0;
        for (Produtos produto : produtos ) {
            somaProdutos += produto.getPreco();
        }
        return "Soma total em produtos: " + somaProdutos / 100  + "R$";
    }

    @GetMapping
    @RequestMapping("/mostrarProdutos")
    public List<Produtos> mostrarProdutos() { return (List<Produtos>) produtosRepository.findAll();}


//    @DeleteMapping("/deletar/{nome}")



}
