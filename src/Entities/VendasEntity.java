package Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Vendas", schema = "Vendas", catalog = "")
public class VendasEntity {
    private String vendaId;
    private Date dataCompra;
    private Double valorTotal;
    private Integer numParcelas;
    private String formaPagamento;
    private Integer statusVenda;

    @Id
    @Column(name = "venda_ID")
    public String getVendaId() {
        return vendaId;
    }

    public void setVendaId(String vendaId) {
        this.vendaId = vendaId;
    }

    @Basic
    @Column(name = "Data_compra")
    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    @Basic
    @Column(name = "valor_total")
    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Basic
    @Column(name = "num_parcelas")
    public Integer getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(Integer numParcelas) {
        this.numParcelas = numParcelas;
    }

    @Basic
    @Column(name = "forma_pagamento")
    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Basic
    @Column(name = "status_venda")
    public Integer getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(Integer statusVenda) {
        this.statusVenda = statusVenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VendasEntity that = (VendasEntity) o;

        if (vendaId != null ? !vendaId.equals(that.vendaId) : that.vendaId != null) return false;
        if (dataCompra != null ? !dataCompra.equals(that.dataCompra) : that.dataCompra != null) return false;
        if (valorTotal != null ? !valorTotal.equals(that.valorTotal) : that.valorTotal != null) return false;
        if (numParcelas != null ? !numParcelas.equals(that.numParcelas) : that.numParcelas != null) return false;
        if (formaPagamento != null ? !formaPagamento.equals(that.formaPagamento) : that.formaPagamento != null)
            return false;
        if (statusVenda != null ? !statusVenda.equals(that.statusVenda) : that.statusVenda != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vendaId != null ? vendaId.hashCode() : 0;
        result = 31 * result + (dataCompra != null ? dataCompra.hashCode() : 0);
        result = 31 * result + (valorTotal != null ? valorTotal.hashCode() : 0);
        result = 31 * result + (numParcelas != null ? numParcelas.hashCode() : 0);
        result = 31 * result + (formaPagamento != null ? formaPagamento.hashCode() : 0);
        result = 31 * result + (statusVenda != null ? statusVenda.hashCode() : 0);
        return result;
    }
}
