package controllers;

import dao.ProductDAO;
import entities.ProductEntity;
import utils.HibernateUtil;

import java.util.List;

public class ProductController {

    private ProductDAO productDAO = new ProductDAO(HibernateUtil.getSessionFactory(), ProductEntity.class);
    private ProductEntity productEntity = new ProductEntity();

    public String checkValid() {

        if (productEntity.getStock() < 0)
            return "Quantidade";
        if (productEntity.getCostPrice() < 0f)
            return "Preço de Venda";
        if (productEntity.getSalePrice() < 0f)
            return "Preço de Compra";
        if (productEntity.getWidth() < 0f)
            return "Largura";
        if (productEntity.getDepth() < 0f)
            return "Profundidade";
        if (productEntity.getHeight() < 0f)
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

        productEntity.setId(id);
        productEntity.setName(productName);
        productEntity.setStock(Integer.parseInt(quantity));
        productEntity.setDescription(description);
        productEntity.setCostPrice(Double.parseDouble(salePrice));
        productEntity.setSalePrice(Double.parseDouble(costPrice));
        productEntity.setHeight(Double.parseDouble(height));
        productEntity.setWidth(Double.parseDouble(width));
        productEntity.setDepth(Double.parseDouble(depth));
        productEntity.setBrand(brand);

        return null;
    }

    public String persist() {
        return productDAO.create(productEntity);
    }

    public List listAll() {
        return productDAO.listAll();
    }

    public String update() {
        return productDAO.update(productEntity);
    }

    public List listAllOrdered() {
        return productDAO.listAllOrdered();
    }
}
