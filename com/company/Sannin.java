package com.company;

public class Sannin extends Ninja{

    public Sannin() {
        super(new BlazingcolumnJutsu(),new ShurikenJutsu());
    }

    @Override
    public void warning() {
        System.out.println("Hey! I am Sannin, and i will kill you");
    }
}
