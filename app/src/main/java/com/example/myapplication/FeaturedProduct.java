package com.example.myapplication;

public class FeaturedProduct {
    private final int imageResource;
    private final String name;
    private String title;


    public FeaturedProduct(String s,String name , int imageResource) {
        this.imageResource = imageResource;
        this.name = name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }


    public void setTitle(String title) {
        this.title = title;
    }
}

