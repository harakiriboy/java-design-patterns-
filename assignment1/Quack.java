package com.company;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("i am quacking");
    }
}
