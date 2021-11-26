package com.company.Strategy;

public class Clinical implements Disease{
    @Override
    public void getSick(String name) {
        System.out.println(name + " Get sick with Clinical illness");
    }
}
