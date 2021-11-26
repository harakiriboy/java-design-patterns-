package com.company.Strategy;

public class Mental implements Disease{
    @Override
    public void getSick(String name) {
        System.out.println(name + " Get sick with Mental illness");
    }
}


