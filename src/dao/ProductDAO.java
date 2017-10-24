package dao;

import com.sun.istack.internal.Nullable;
import entities.ProductEntity;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;

public class ProductDAO extends AbstractDAO<ProductEntity> {

    public ProductDAO(SessionFactory sessionFactory, Class abstractDAO) {
        super(sessionFactory, abstractDAO);
    }

    public String create(ProductEntity product) {
        try {
            persist(product);
            return "O produto foi salvo com sucesso.";
        } catch (Exception e) {
            return "Ocorreu um erro durante a persitência do produto no banco de dados.";
        }
    }

    public Optional<ProductEntity> findById(Integer productId) {
        return Optional.ofNullable(this.get(productId));
    }

    public List listAll() {
        return list(ProductEntity.class);
    }

    public List listAllOrdered() {
        return listAllOrdered("SELECT * FROM Produto ORDER BY Nome_prod");
    }

    public void update(
            Integer prodId,
            @Nullable String productName,
            @Nullable Integer quantity,
            @Nullable String description,
            @Nullable Double salePrice,
            @Nullable Double costPrice,
            @Nullable Double height,
            @Nullable Double width,
            @Nullable Double depth,
            @Nullable String brand
    ) {

        Optional<ProductEntity> product = findById(prodId);

        if (product.isPresent()) {
            ProductEntity productEntity = product.get();
            if (productName != null) productEntity.setNomeProd(productName);
            if (quantity != null && quantity >= 0) productEntity.setQuantidadeEstoque(quantity);
            if (description != null) productEntity.setDescricao(description);
            if (costPrice != null && costPrice > 0f) {
                productEntity.setPrecoCusto(costPrice);
                if (salePrice != null && salePrice > costPrice)
                    if (height != null) productEntity.setAltura(height);
            } else {
                if (salePrice != null && salePrice > productEntity.getPrecoCusto())
                    productEntity.setPrecoVenda(salePrice);
            }
            if (height != null && height > 0f) productEntity.setAltura(height);
            if (width != null && width > 0f) productEntity.setLargura(width);
            if (depth != null && depth > 0f) productEntity.setProfundidade(depth);
            if (brand != null) productEntity.setMarca(brand);

            persist(productEntity);
        }

    }

    public void delete(Integer id) {
        Optional<ProductEntity> product = findById(id);
        product.ifPresent(productEntity -> remove());
    }
}
