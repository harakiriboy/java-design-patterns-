package com.company.Strategy;

public class Animal extends Patient{
    String name;
    String type;
    int age;

    public Animal(String name, String type, int age){
        this.name = name;
        this.type = type;
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println("Patient name is: "+name);
        System.out.println("Type is: " + type);
        startSicking(name);
    }
}
