package com.company.Strategy;
import com.company.Observer.Observer;
import java.util.List;

public class Human extends Patient implements Observer {
    String name;
    String type;
    int age;

    public Human(String name, String type, int age){
        this.name = name;
        this.type = type;
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println("Patient name is: "+name);
        System.out.println("Type is: "+type);
        startSicking(name);
    }

    @Override
    public void EventHandle(List<String> medicaments) {
        System.out.println("Dear "+name+"! Medicament warehouse has changed, this is what we have at that moment: "+ medicaments);
    }
}
