package com.company;

public class Main {
    public static void main(String[] args) {
        Ninja sasuke = new GreatNinja();
        sasuke.warning();
        sasuke.performBlowing();
        sasuke.performThrowing();

        sasuke.setFireJutsu(new KirinJutsu());
        sasuke.performBlowing();
    }
}
