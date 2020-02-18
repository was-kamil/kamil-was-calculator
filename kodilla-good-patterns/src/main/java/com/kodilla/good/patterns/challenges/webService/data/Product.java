package com.kodilla.good.patterns.challenges.webService.data;
import java.util.Objects;


public class Product {

    private final String productName;
    private final long productID;
    private final double productCost;
    private final Category productCategory;

    public Product(String productName, long productID, double productCost, Category productCategory) {
        this.productName = productName;
        this.productID = productID;
        this.productCost = productCost;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductCost() {
        return productCost;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public long getProductID() {
        return productID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID &&
                Double.compare(product.productCost, productCost) == 0 &&
                Objects.equals(productName, product.productName) &&
                productCategory == product.productCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productID, productCost, productCategory);
    }
}