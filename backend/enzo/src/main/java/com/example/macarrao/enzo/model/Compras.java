package com.example.macarrao.enzo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer compraId;

    @Column(nullable = false)
    private Date dataCompra;

    @Column(nullable = false)
    private String fornecedor;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "produto_id")
    private Produtos produtoForeign;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private Integer precoUnitario;

    public Integer getCompraId() {
        return compraId;
    }

    public void setCompraId(Integer compraId) {
        this.compraId = compraId;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produtos getProdutoForeign() {
        return produtoForeign;
    }

    public void setProdutoForeign(Produtos produtoForeign) {
        this.produtoForeign = produtoForeign;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Integer precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
