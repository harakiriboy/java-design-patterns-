package com.company;

public abstract class Weapon {
    String description = "Some fire weapon";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
