package com.company;

public class Stock extends WeaponAccessoryDecorator{
    Weapon weapon;

    public Stock(Weapon weapon){
        this.weapon = weapon;
    }

    public String getDescription(){
        return weapon.getDescription() + ", with Stock";
    }

    public double cost(){
        return weapon.cost() + 17.0;
    }
}
