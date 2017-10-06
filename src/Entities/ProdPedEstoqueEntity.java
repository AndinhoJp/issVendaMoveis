package Entities;

import javax.persistence.*;

@Entity
@Table(name = "ProdPedEstoque", schema = "Vendas", catalog = "")
public class ProdPedEstoqueEntity {
    private Integer quantidade;
    private Integer quantidadePedAtend;
    private Integer stat;
    private String idProdPedEsotque;

    @Basic
    @Column(name = "quantidade")
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Basic
    @Column(name = "quantidadePedAtend")
    public Integer getQuantidadePedAtend() {
        return quantidadePedAtend;
    }

    public void setQuantidadePedAtend(Integer quantidadePedAtend) {
        this.quantidadePedAtend = quantidadePedAtend;
    }

    @Basic
    @Column(name = "stat")
    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    @Id
    @Column(name = "IdProdPedEsotque")
    public String getIdProdPedEsotque() {
        return idProdPedEsotque;
    }

    public void setIdProdPedEsotque(String idProdPedEsotque) {
        this.idProdPedEsotque = idProdPedEsotque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProdPedEstoqueEntity that = (ProdPedEstoqueEntity) o;

        if (quantidade != null ? !quantidade.equals(that.quantidade) : that.quantidade != null) return false;
        if (quantidadePedAtend != null ? !quantidadePedAtend.equals(that.quantidadePedAtend) : that.quantidadePedAtend != null)
            return false;
        if (stat != null ? !stat.equals(that.stat) : that.stat != null) return false;
        if (idProdPedEsotque != null ? !idProdPedEsotque.equals(that.idProdPedEsotque) : that.idProdPedEsotque != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = quantidade != null ? quantidade.hashCode() : 0;
        result = 31 * result + (quantidadePedAtend != null ? quantidadePedAtend.hashCode() : 0);
        result = 31 * result + (stat != null ? stat.hashCode() : 0);
        result = 31 * result + (idProdPedEsotque != null ? idProdPedEsotque.hashCode() : 0);
        return result;
    }
}
