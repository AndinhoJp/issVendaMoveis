package Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Parcela", schema = "Vendas", catalog = "")
public class ParcelaEntity {
    private String parcelaId;
    private Integer parcela;
    private Integer parcelaPaga;
    private Double valorTotal;
    private Double totalPago;
    private Double juros;
    private Date dataParcela;

    @Id
    @Column(name = "parcela_ID")
    public String getParcelaId() {
        return parcelaId;
    }

    public void setParcelaId(String parcelaId) {
        this.parcelaId = parcelaId;
    }

    @Basic
    @Column(name = "parcela")
    public Integer getParcela() {
        return parcela;
    }

    public void setParcela(Integer parcela) {
        this.parcela = parcela;
    }

    @Basic
    @Column(name = "parcela_paga")
    public Integer getParcelaPaga() {
        return parcelaPaga;
    }

    public void setParcelaPaga(Integer parcelaPaga) {
        this.parcelaPaga = parcelaPaga;
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
    @Column(name = "total_pago")
    public Double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(Double totalPago) {
        this.totalPago = totalPago;
    }

    @Basic
    @Column(name = "juros")
    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    @Basic
    @Column(name = "data_parcela")
    public Date getDataParcela() {
        return dataParcela;
    }

    public void setDataParcela(Date dataParcela) {
        this.dataParcela = dataParcela;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParcelaEntity that = (ParcelaEntity) o;

        if (parcelaId != null ? !parcelaId.equals(that.parcelaId) : that.parcelaId != null) return false;
        if (parcela != null ? !parcela.equals(that.parcela) : that.parcela != null) return false;
        if (parcelaPaga != null ? !parcelaPaga.equals(that.parcelaPaga) : that.parcelaPaga != null) return false;
        if (valorTotal != null ? !valorTotal.equals(that.valorTotal) : that.valorTotal != null) return false;
        if (totalPago != null ? !totalPago.equals(that.totalPago) : that.totalPago != null) return false;
        if (juros != null ? !juros.equals(that.juros) : that.juros != null) return false;
        if (dataParcela != null ? !dataParcela.equals(that.dataParcela) : that.dataParcela != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = parcelaId != null ? parcelaId.hashCode() : 0;
        result = 31 * result + (parcela != null ? parcela.hashCode() : 0);
        result = 31 * result + (parcelaPaga != null ? parcelaPaga.hashCode() : 0);
        result = 31 * result + (valorTotal != null ? valorTotal.hashCode() : 0);
        result = 31 * result + (totalPago != null ? totalPago.hashCode() : 0);
        result = 31 * result + (juros != null ? juros.hashCode() : 0);
        result = 31 * result + (dataParcela != null ? dataParcela.hashCode() : 0);
        return result;
    }
}
