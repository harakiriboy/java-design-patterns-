package com.company;

public class Magazine extends WeaponAccessoryDecorator {
    Weapon weapon;

    public Magazine(Weapon weapon){
        this.weapon = weapon;
    }

    public String getDescription(){
        return weapon.getDescription() + ", with Magazine";
    }

    public double cost(){
        return weapon.cost() + 15.0;
    }
}
