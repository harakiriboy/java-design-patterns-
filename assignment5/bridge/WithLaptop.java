package com.company;

public class WithLaptop extends StudentAttributes{

    public WithLaptop(BasicStudent newBasicStudent) {
        super(newBasicStudent);
    }

    @Override
    public void withtablet() {
        System.out.println("This student didn't use tablet");
    }
}
