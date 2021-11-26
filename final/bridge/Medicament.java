package com.company.Bridge;

public abstract class Medicament {
    Price price;
    public Medicament(Price price){
        this.price = price;
    }

    public abstract void showdetails();
}
