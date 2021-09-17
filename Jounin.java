package com.company;

public class Jounin extends Ninja{

    public Jounin() {
        super(new BlazingcolumnJutsu(), new KunaiJustu());
    }

    @Override
    public void warning() {
        System.out.println("Hey! I am Jounin, and i will kill you");
    }
}
