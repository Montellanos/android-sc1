package com.factorybyte.demosc1.models;

public class Dress {


    private String description, image, name;
    private int telephone, price;


    public Dress(){

    }

    public Dress(String description, String image, String name, int telephone, int price) {
        this.description = description;
        this.image = image;
        this.name = name;
        this.telephone = telephone;
        this.price = price;
    }


    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getTelephone() {
        return telephone;
    }

    public int getPrice() {
        return price;
    }
}
