package com.company;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        super(new FlyNoWay(), new QuackNoWay());
    }

    @Override
    public void display() {
        System.out.println("i am decoy");
    }

}
