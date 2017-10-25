package entities;

import javax.persistence.*;

@Entity
@Table(name = "Produto", schema = "Vendas", catalog = "")
public class ProductEntity {
    private String id;
    private String name;
    private int stock;
    private String description;
    private Double costPrice;
    private Double salePrice;
    private Double height;
    private Double width;
    private Double depth;
    private String brand;

    @Id
    @Column(name = "prod_ID")
    public String getId() {
        return id;
    }

    public void setId(String prodId) {
        this.id = prodId;
    }

    @Basic
    @Column(name = "Nome_prod")
    public String getName() {
        return name;
    }

    public void setName(String nomeProd) {
        this.name = nomeProd;
    }

    @Basic
    @Column(name = "Quantidade_estoque")
    public int getStock() {
        return stock;
    }

    public void setStock(int quantidadeEstoque) {
        this.stock = quantidadeEstoque;
    }

    @Basic
    @Column(name = "Descricao")
    public String getDescription() {
        return description;
    }

    public void setDescription(String descricao) {
        this.description = descricao;
    }

    @Basic
    @Column(name = "preco_venda")
    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double precoVenda) {
        this.costPrice = precoVenda;
    }

    @Basic
    @Column(name = "preco_custo")
    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double precoCusto) {
        this.salePrice = precoCusto;
    }

    @Basic
    @Column(name = "altura")
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double altura) {
        this.height = altura;
    }

    @Basic
    @Column(name = "largura")
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double largura) {
        this.width = largura;
    }

    @Basic
    @Column(name = "profundidade")
    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double profundidade) {
        this.depth = profundidade;
    }

    @Basic
    @Column(name = "marca")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String marca) {
        this.brand = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (stock != that.stock) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (costPrice != null ? !costPrice.equals(that.costPrice) : that.costPrice != null) return false;
        if (salePrice != null ? !salePrice.equals(that.salePrice) : that.salePrice != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (width != null ? !width.equals(that.width) : that.width != null) return false;
        if (depth != null ? !depth.equals(that.depth) : that.depth != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + stock;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (costPrice != null ? costPrice.hashCode() : 0);
        result = 31 * result + (salePrice != null ? salePrice.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (depth != null ? depth.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        return result;
    }
}
