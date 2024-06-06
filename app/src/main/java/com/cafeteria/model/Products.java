package com.cafeteria.model;

public class Products {
    int imageProduct;
    String nameProduct;
    String descriptionProduct;
    String priceProduct;

    public Products(
        int imageProduct,
        String nameProduct,
        String descriptionProduct,
        String priceProduct
    ) {
        this.imageProduct = imageProduct;
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.priceProduct = priceProduct;
    }

    public int getImageProduct() {
        return imageProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }
}
