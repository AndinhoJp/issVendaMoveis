package entities;

import javax.persistence.*;

@Entity
@Table(name = "Gastos", schema = "Vendas", catalog = "")
public class SpensesEntity {
    private String idGasto;
    private String nomeGasto;
    private Double valor;
    private String data;

    @Id
    @Column(name = "idGasto")
    public String getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(String idGasto) {
        this.idGasto = idGasto;
    }

    @Basic
    @Column(name = "nomeGasto")
    public String getNomeGasto() {
        return nomeGasto;
    }

    public void setNomeGasto(String nomeGasto) {
        this.nomeGasto = nomeGasto;
    }

    @Basic
    @Column(name = "valor")
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Basic
    @Column(name = "data")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpensesEntity that = (SpensesEntity) o;

        if (idGasto != null ? !idGasto.equals(that.idGasto) : that.idGasto != null) return false;
        if (nomeGasto != null ? !nomeGasto.equals(that.nomeGasto) : that.nomeGasto != null) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGasto != null ? idGasto.hashCode() : 0;
        result = 31 * result + (nomeGasto != null ? nomeGasto.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}
