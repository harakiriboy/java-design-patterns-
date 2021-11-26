package com.company.Bridge;

public class Citramon extends Medicament{
    public Citramon(Price price) {
        super(price);
    }

    @Override
    public void showdetails() {
        System.out.println("Medicament citramon");
        price.setPrice();
    }
}
