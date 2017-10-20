package com.example.cmd.shop.JavaClasses.Models;

/**
 * Created by cmd on 20.10.17.
 */

public class ProductTest {
    private String productId;
    private String title,description,imgString;
    private double price;

    public ProductTest(String title, String description, String imgString, double price) {
        this.title = title;
        this.description = description;
        this.imgString = imgString;
        this.price = price;
        this.productId = "";
    }


    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgString() {
        return imgString;
    }

    public void setImgString(String imgString) {
        this.imgString = imgString;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
