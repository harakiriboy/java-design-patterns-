package com.company.Strategy;

public class Infection implements Disease{
    @Override
    public void getSick(String name) {
        System.out.println(name + " Get sick with Infectional illness");
    }
}
