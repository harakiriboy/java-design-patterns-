package com.company;

public class GreatNinja extends Ninja{

    public GreatNinja() {
        super(new FiredragonJutsu(), new KunaiJustu());
    }

    @Override
    public void warning() {
        System.out.println("Hey! I am Great Ninja, and i will kill you");
    }
}
