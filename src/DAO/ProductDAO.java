package DAO;

import Entities.ProdutoEntity;
import com.sun.istack.internal.Nullable;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;

public class ProductDAO extends AbstractDAO<ProdutoEntity> {

    public ProductDAO(SessionFactory sessionFactory, Class abstractDAO) {
        super(sessionFactory, abstractDAO);
    }

    public void create(
            String productName,
            int quantity,
            String description,
            Double salePrice,
            Double costPrice,
            Double height,
            Double width,
            Double depth,
            String brand
    ) {

        ProdutoEntity productEntity = new ProdutoEntity();
        productEntity.setNomeProd(productName);
        productEntity.setQuantidadeEstoque(quantity);
        productEntity.setDescricao(description);
        productEntity.setPrecoVenda(salePrice);
        productEntity.setPrecoCusto(costPrice);
        productEntity.setAltura(height);
        productEntity.setLargura(width);
        productEntity.setProfundidade(depth);
        productEntity.setMarca(brand);

        persist(productEntity);
    }

    public Optional<ProdutoEntity> findById(Integer productId) {
        return Optional.ofNullable(this.get(productId));
    }

    public List<ProdutoEntity> listAll() {
        return list(criteria());
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

        Optional<ProdutoEntity> product = findById(prodId);

        if (product.isPresent()) {
            ProdutoEntity productEntity = product.get();
            if (productName != null) productEntity.setNomeProd(productName);
            if (quantity != null) productEntity.setQuantidadeEstoque(quantity);
            if (description != null) productEntity.setDescricao(description);
            if (salePrice != null) productEntity.setPrecoVenda(salePrice);
            if (costPrice != null) productEntity.setPrecoCusto(costPrice);
            if (height != null) productEntity.setAltura(height);
            if (width != null) productEntity.setLargura(width);
            if (depth != null) productEntity.setProfundidade(depth);
            if (brand != null) productEntity.setMarca(brand);
            persist(productEntity);
        }

    }

    public void delete(Integer id) {
        Optional<ProdutoEntity> product = findById(id);
        product.ifPresent(productEntity -> remove());
    }
}
