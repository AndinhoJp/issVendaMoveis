package entities;

import javax.persistence.*;

@Entity
@Table(name = "Prod_Venda", schema = "Vendas", catalog = "")
public class ProdVendaEntity {
    private String prodVendaId;
    private Integer quantidade;
    private Double valorUnitario;

    @Id
    @Column(name = "prodVenda_ID")
    public String getProdVendaId() {
        return prodVendaId;
    }

    public void setProdVendaId(String prodVendaId) {
        this.prodVendaId = prodVendaId;
    }

    @Basic
    @Column(name = "quantidade")
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Basic
    @Column(name = "valor_unitario")
    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProdVendaEntity that = (ProdVendaEntity) o;

        if (prodVendaId != null ? !prodVendaId.equals(that.prodVendaId) : that.prodVendaId != null) return false;
        if (quantidade != null ? !quantidade.equals(that.quantidade) : that.quantidade != null) return false;
        if (valorUnitario != null ? !valorUnitario.equals(that.valorUnitario) : that.valorUnitario != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prodVendaId != null ? prodVendaId.hashCode() : 0;
        result = 31 * result + (quantidade != null ? quantidade.hashCode() : 0);
        result = 31 * result + (valorUnitario != null ? valorUnitario.hashCode() : 0);
        return result;
    }
}
