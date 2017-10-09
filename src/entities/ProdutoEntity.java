package entities;

import javax.persistence.*;

@Entity
@Table(name = "Produto", schema = "Vendas", catalog = "")
public class ProdutoEntity {
    private String prodId;
    private String nomeProd;
    private int quantidadeEstoque;
    private String descricao;
    private Double precoVenda;
    private Double precoCusto;
    private Double altura;
    private Double largura;
    private Double profundidade;
    private String marca;

    @Id
    @Column(name = "prod_ID")
    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    @Basic
    @Column(name = "Nome_prod")
    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    @Basic
    @Column(name = "Quantidade_estoque")
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Basic
    @Column(name = "Descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Basic
    @Column(name = "preco_venda")
    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Basic
    @Column(name = "preco_custo")
    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Basic
    @Column(name = "altura")
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Basic
    @Column(name = "largura")
    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    @Basic
    @Column(name = "profundidade")
    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }

    @Basic
    @Column(name = "marca")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProdutoEntity that = (ProdutoEntity) o;

        if (quantidadeEstoque != that.quantidadeEstoque) return false;
        if (prodId != null ? !prodId.equals(that.prodId) : that.prodId != null) return false;
        if (nomeProd != null ? !nomeProd.equals(that.nomeProd) : that.nomeProd != null) return false;
        if (descricao != null ? !descricao.equals(that.descricao) : that.descricao != null) return false;
        if (precoVenda != null ? !precoVenda.equals(that.precoVenda) : that.precoVenda != null) return false;
        if (precoCusto != null ? !precoCusto.equals(that.precoCusto) : that.precoCusto != null) return false;
        if (altura != null ? !altura.equals(that.altura) : that.altura != null) return false;
        if (largura != null ? !largura.equals(that.largura) : that.largura != null) return false;
        if (profundidade != null ? !profundidade.equals(that.profundidade) : that.profundidade != null) return false;
        if (marca != null ? !marca.equals(that.marca) : that.marca != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prodId != null ? prodId.hashCode() : 0;
        result = 31 * result + (nomeProd != null ? nomeProd.hashCode() : 0);
        result = 31 * result + quantidadeEstoque;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (precoVenda != null ? precoVenda.hashCode() : 0);
        result = 31 * result + (precoCusto != null ? precoCusto.hashCode() : 0);
        result = 31 * result + (altura != null ? altura.hashCode() : 0);
        result = 31 * result + (largura != null ? largura.hashCode() : 0);
        result = 31 * result + (profundidade != null ? profundidade.hashCode() : 0);
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        return result;
    }
}
