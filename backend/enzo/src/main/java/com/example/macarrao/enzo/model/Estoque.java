package com.example.macarrao.enzo.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer estoqueId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "produto_id")
    private Estoque produtoForeign;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private Date dataAtualizacao;

    public Integer getEstoqueId() {
        return estoqueId;
    }

    public void setEstoqueId(Integer estoqueId) {
        this.estoqueId = estoqueId;
    }

    public Estoque getProdutoForeign() {
        return produtoForeign;
    }

    public void setProdutoForeign(Estoque produtoForeign) {
        this.produtoForeign = produtoForeign;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}
