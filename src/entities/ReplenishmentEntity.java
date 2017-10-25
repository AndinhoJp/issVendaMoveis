package entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "PedidoEstoque", schema = "Vendas", catalog = "")
public class ReplenishmentEntity {
    private String id;
    private int status;
    private Date dateCreated;
    private Date dateAttended;

    @Id
    @Column(name = "IdPedEst")
    public String getId() {
        return id;
    }

    public void setId(String idPedEst) {
        this.id = idPedEst;
    }

    @Basic
    @Column(name = "dataPed")
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dataPed) {
        this.dateCreated = dataPed;
    }

    @Basic
    @Column(name = "dataAtend")
    public Date getDateAttended() {
        return dateAttended;
    }

    public void setDateAttended(Date dataAtend) {
        this.dateAttended = dataAtend;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReplenishmentEntity that = (ReplenishmentEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
        if (dateAttended != null ? !dateAttended.equals(that.dateAttended) : that.dateAttended != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (dateAttended != null ? dateAttended.hashCode() : 0);
        return result;
    }
}
