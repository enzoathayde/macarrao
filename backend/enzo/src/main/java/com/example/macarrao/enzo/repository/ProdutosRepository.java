package com.example.macarrao.enzo.repository;

import com.example.macarrao.enzo.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos,Integer> {
}
