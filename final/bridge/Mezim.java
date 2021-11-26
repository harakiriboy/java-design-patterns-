package com.company.Bridge;

public class Mezim extends Medicament{
    public Mezim(Price price) {
        super(price);
    }

    @Override
    public void showdetails() {
        System.out.println("Medicament mezim");
        price.setPrice();
    }
}
