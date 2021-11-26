package com.company.Bridge;

public class Aspirin extends Medicament{
    public Aspirin(Price price) {
        super(price);
    }

    @Override
    public void showdetails() {
        System.out.println("Medicament aspirin");
        price.setPrice();
    }
}
