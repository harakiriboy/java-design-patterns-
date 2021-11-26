package com.company.Strategy;

public class Birds extends Patient{
    String name;
    String type;
    int age;

    public Birds(String birdname, String type, int age){
        this.name = birdname;
        this.type = type;
        this.age = age;
    }


    @Override
    public void display() {
        System.out.println("Patient name is: "+name);
        System.out.println("Type is: "+type);
        startSicking(name);
    }


}
