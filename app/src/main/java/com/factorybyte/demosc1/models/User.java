package com.factorybyte.demosc1.models;

public class User {


    private String name, image, skills, location;

    public User(){

    }

    public User(String name, String image, String skills, String location) {
        this.name = name;
        this.image = image;
        this.skills = skills;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getSkills() {
        return skills;
    }

    public String getLocation() {
        return location;
    }
}
