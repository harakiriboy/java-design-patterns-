package com.company;

public class Samurai implements Fighter {
    @Override
    public void attack() {
        System.out.println("Samurai attacks!!");
    }

    @Override
    public void defend() {
        System.out.println("Samurai defends...");
    }

    @Override
    public void escape() {
        System.out.println("Run Samurai run...");
    }
}
