package com.company;

// Main message : Program to an interface, not an implementation
// Main message 2.0 : Prefer composition over inheritance

public class Main {
    public static void main(String[] args) {

        Duck decoyduck = new DecoyDuck();
        decoyduck.display();
        decoyduck.performFly();
        decoyduck.performQuack();

        decoyduck.setFlyBehavior(new FlyWithRocket());
        decoyduck.performFly();

    }

}

