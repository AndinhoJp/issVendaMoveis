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

    public Optional<ProductEntity> findById(String productId) {
        return Optional.ofNullable(this.get(productId));
    }

    public List listAll() {
        return list(ProductEntity.class);
    }

    public List listAllOrdered() {
        return listAllOrdered("from ProductEntity order by Nome_prod");
    }

    public void update(
            String prodId,
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
            if (productName != null) productEntity.setName(productName);
            if (quantity != null && quantity >= 0) productEntity.setStock(quantity);
            if (description != null) productEntity.setDescription(description);
            if (costPrice != null && costPrice > 0f) {
                productEntity.setSalePrice(costPrice);
                if (salePrice != null && salePrice > costPrice)
                    if (height != null) productEntity.setHeight(height);
            } else {
                if (salePrice != null && salePrice > productEntity.getSalePrice())
                    productEntity.setCostPrice(salePrice);
            }
            if (height != null && height > 0f) productEntity.setHeight(height);
            if (width != null && width > 0f) productEntity.setWidth(width);
            if (depth != null && depth > 0f) productEntity.setDepth(depth);
            if (brand != null) productEntity.setBrand(brand);

            persist(productEntity);
        }

    }

    public String update(ProductEntity product) {

        Optional<ProductEntity> productOptional = findById(product.getId());

        if (productOptional.isPresent()) {
            persist(product);
            return "Produto atualizado com sucesso.";
        }

        return "Ocorreu um erro durante a atualização do produto.";

    }

    public void delete(String id) {
        Optional<ProductEntity> product = findById(id);
        product.ifPresent(productEntity -> remove());
    }
}
