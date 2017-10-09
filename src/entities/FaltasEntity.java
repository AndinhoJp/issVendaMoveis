package entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Faltas", schema = "Vendas", catalog = "")
public class FaltasEntity {
    private String idFaltas;
    private Integer justificativaFlag;
    private String justificativatextual;
    private Date datafalta;

    @Id
    @Column(name = "idFaltas")
    public String getIdFaltas() {
        return idFaltas;
    }

    public void setIdFaltas(String idFaltas) {
        this.idFaltas = idFaltas;
    }

    @Basic
    @Column(name = "justificativaFlag")
    public Integer getJustificativaFlag() {
        return justificativaFlag;
    }

    public void setJustificativaFlag(Integer justificativaFlag) {
        this.justificativaFlag = justificativaFlag;
    }

    @Basic
    @Column(name = "justificativatextual")
    public String getJustificativatextual() {
        return justificativatextual;
    }

    public void setJustificativatextual(String justificativatextual) {
        this.justificativatextual = justificativatextual;
    }

    @Basic
    @Column(name = "datafalta")
    public Date getDatafalta() {
        return datafalta;
    }

    public void setDatafalta(Date datafalta) {
        this.datafalta = datafalta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FaltasEntity that = (FaltasEntity) o;

        if (idFaltas != null ? !idFaltas.equals(that.idFaltas) : that.idFaltas != null) return false;
        if (justificativaFlag != null ? !justificativaFlag.equals(that.justificativaFlag) : that.justificativaFlag != null)
            return false;
        if (justificativatextual != null ? !justificativatextual.equals(that.justificativatextual) : that.justificativatextual != null)
            return false;
        if (datafalta != null ? !datafalta.equals(that.datafalta) : that.datafalta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFaltas != null ? idFaltas.hashCode() : 0;
        result = 31 * result + (justificativaFlag != null ? justificativaFlag.hashCode() : 0);
        result = 31 * result + (justificativatextual != null ? justificativatextual.hashCode() : 0);
        result = 31 * result + (datafalta != null ? datafalta.hashCode() : 0);
        return result;
    }
}
