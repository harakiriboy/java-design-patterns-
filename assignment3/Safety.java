package com.company;

public class Safety extends WeaponAccessoryDecorator{
    Weapon weapon;

    public Safety(Weapon weapon){
        this.weapon = weapon;
    }

    public String getDescription(){
        return weapon.getDescription() + ", with Safety";
    }

    public double cost(){
        return weapon.cost() + 12.0;
    }
}
