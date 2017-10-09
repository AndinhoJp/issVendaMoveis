package entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "PedidoEstoque", schema = "Vendas", catalog = "")
public class PedidoEstoqueEntity {
    private String idPedEst;
    private Date dataPed;
    private Date dataAtend;

    @Id
    @Column(name = "IdPedEst")
    public String getIdPedEst() {
        return idPedEst;
    }

    public void setIdPedEst(String idPedEst) {
        this.idPedEst = idPedEst;
    }

    @Basic
    @Column(name = "dataPed")
    public Date getDataPed() {
        return dataPed;
    }

    public void setDataPed(Date dataPed) {
        this.dataPed = dataPed;
    }

    @Basic
    @Column(name = "dataAtend")
    public Date getDataAtend() {
        return dataAtend;
    }

    public void setDataAtend(Date dataAtend) {
        this.dataAtend = dataAtend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PedidoEstoqueEntity that = (PedidoEstoqueEntity) o;

        if (idPedEst != null ? !idPedEst.equals(that.idPedEst) : that.idPedEst != null) return false;
        if (dataPed != null ? !dataPed.equals(that.dataPed) : that.dataPed != null) return false;
        if (dataAtend != null ? !dataAtend.equals(that.dataAtend) : that.dataAtend != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPedEst != null ? idPedEst.hashCode() : 0;
        result = 31 * result + (dataPed != null ? dataPed.hashCode() : 0);
        result = 31 * result + (dataAtend != null ? dataAtend.hashCode() : 0);
        return result;
    }
}
