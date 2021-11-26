package com.company.Strategy;

public abstract class Patient {
    public int age;
    Disease disease;

    public void setIllness(Disease disease){
        this.disease = disease;
    }

    public void startSicking(String name){
        disease.getSick(name);
    }

    public abstract void display();

}
