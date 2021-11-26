package com.company.Bridge;

public class FreeForKids implements Price{
    @Override
    public void setPrice() {
        System.out.println("Free for kids");
    }
}
