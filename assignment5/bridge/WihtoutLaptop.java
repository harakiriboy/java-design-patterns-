package com.company;

public class WihtoutLaptop extends StudentAttributes{

    public WihtoutLaptop(BasicStudent newBasicStudent) {
        super(newBasicStudent);
    }

    @Override
    public void withtablet() {
        System.out.println("This student use tablet");
    }
}

