package com.example.miniproject;

public class Product {
    int ImageId;
    String Title,Price;

    public Product(int imageId, String title, String price) {
        ImageId = imageId;
        Title = title;
        Price = price;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
