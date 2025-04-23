package org.skypro.skyshop.product;

public abstract class Product {
    private String nameProduct;


    public Product(String nameProduct) {
        this.nameProduct = nameProduct;

    }

    public String getNameProduct() {
        return nameProduct;
    }

    public abstract int getPrice();

    @Override
    public abstract String toString();

    public abstract boolean isSpecial();
}

