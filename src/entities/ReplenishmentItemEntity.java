package entities;

import javax.persistence.*;

@Entity
@Table(name = "ProdPedEstoque", schema = "Vendas", catalog = "")
public class ReplenishmentItemEntity {
    private Integer quantity;
    private Integer quantitySettled;
    private Integer status;
    private String orderId;

    @Basic
    @Column(name = "quantidade")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantidade) {
        this.quantity = quantidade;
    }

    @Basic
    @Column(name = "quantidadePedAtend")
    public Integer getQuantitySettled() {
        return quantitySettled;
    }

    public void setQuantitySettled(Integer quantidadePedAtend) {
        this.quantitySettled = quantidadePedAtend;
    }

    @Basic
    @Column(name = "stat")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer stat) {
        this.status = stat;
    }

    @Id
    @Column(name = "IdProdPedEsotque")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String idProdPedEsotque) {
        this.orderId = idProdPedEsotque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReplenishmentItemEntity that = (ReplenishmentItemEntity) o;

        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (quantitySettled != null ? !quantitySettled.equals(that.quantitySettled) : that.quantitySettled != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = quantity != null ? quantity.hashCode() : 0;
        result = 31 * result + (quantitySettled != null ? quantitySettled.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        return result;
    }
}
