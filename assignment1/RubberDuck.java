package com.company;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNoWay(),new Squeack());
    }

    @Override
    public void display() {
        System.out.println("i am rubberduck");
    }
}
