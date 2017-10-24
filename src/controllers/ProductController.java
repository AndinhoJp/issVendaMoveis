package controllers;

import dao.ProductDAO;
import entities.ProductEntity;
import utils.HibernateUtil;

import java.util.List;

public class ProductController {

    private ProductDAO productDAO = new ProductDAO(HibernateUtil.getSessionFactory(), ProductEntity.class);
    private ProductEntity productEntity = new ProductEntity();

    public String checkValid() {

        if (productEntity.getQuantidadeEstoque() < 0)
            return "Quantidade";
        if (productEntity.getPrecoVenda() < 0f)
            return "Preço de Venda";
        if (productEntity.getPrecoCusto() < 0f)
            return "Preço de Compra";
        if (productEntity.getLargura() < 0f)
            return "Largura";
        if (productEntity.getProfundidade() < 0f)
            return "Profundidade";
        if (productEntity.getAltura() < 0f)
            return "Altura";
        return null;

    }

    public String setProductValues(String id, String productName, String quantity, String description, String salePrice, String costPrice, String height, String width, String depth, String brand) {

        if ("".equals(productName)) {
            return "Nome";
        } else if ("".equals(quantity)) {
            return "Quantidade";
        } else if ("".equals(description)) {
            return "Descrição";
        } else if ("".equals(salePrice)) {
            return "Preço de Venda";
        } else if ("".equals(salePrice)) {
            return "Preço de custo";
        } else if ("".equals(height)) {
            return "Altura";
        } else if ("".equals(width)) {
            return "Largura";
        } else if ("".equals(depth)) {
            return "Profundidade";
        } else if ("".equals(brand)) {
            return "Marca";
        }

        productEntity.setProdId(id);
        productEntity.setNomeProd(productName);
        productEntity.setQuantidadeEstoque(Integer.parseInt(quantity));
        productEntity.setDescricao(description);
        productEntity.setPrecoVenda(Double.parseDouble(salePrice));
        productEntity.setPrecoCusto(Double.parseDouble(costPrice));
        productEntity.setAltura(Double.parseDouble(height));
        productEntity.setLargura(Double.parseDouble(width));
        productEntity.setProfundidade(Double.parseDouble(depth));
        productEntity.setMarca(brand);

        return null;
    }

    public String persist() {
        return productDAO.create(productEntity);
    }

    public List listAll() {
        return productDAO.listAll();
    }

    public List<ProductEntity> listAllOrdered() {
        return productDAO.listAllOrdered();
    }
}
