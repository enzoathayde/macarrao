package com.example.macarrao.enzo.controller;


import com.example.macarrao.enzo.model.Pedidos;
import com.example.macarrao.enzo.model.Produtos;
import com.example.macarrao.enzo.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    private PedidosRepository pedidosRepository;

    @Autowired
    public PedidosController(PedidosRepository pedidosRepository) { this.pedidosRepository = pedidosRepository; }

    @PostMapping
    @RequestMapping
    public Pedidos criarPedido (@RequestBody Pedidos novoPedido) {
        return pedidosRepository.save(novoPedido);
    }


}
