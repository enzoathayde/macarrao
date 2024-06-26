package com.example.macarrao.enzo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pedidoId;

    @Column
    private Date dataHora;

    @Column
    private Integer precoTotal;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "produto_id")
    private Produtos produtosForeign;

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Integer getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Integer precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Produtos getProdutosForeign() {
        return produtosForeign;
    }

    public void setProdutosForeign(Produtos produtosForeign) {
        this.produtosForeign = produtosForeign;
    }
}
