package com.company;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super(new FlyWithWings(),new Quack());
    }

    @Override
    public void display() {
        System.out.println("i am redhead");
    }
}
