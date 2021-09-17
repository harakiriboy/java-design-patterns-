package com.company;

public class Chunin extends Ninja{
    public Chunin() {

        super(new FireballJutsu(), new ShurikenJutsu());

    }

    @Override
    public void warning() {
        System.out.println("Hey! I am chunin, and i will kill you");
    }
}
