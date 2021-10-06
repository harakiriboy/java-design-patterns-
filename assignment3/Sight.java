package com.company;

public class Sight extends WeaponAccessoryDecorator{

    Weapon weapon;

    public Sight(Weapon weapon){
        this.weapon = weapon;
    }

    public String getDescription(){
        return weapon.getDescription() + ", with Sight";
    }

    public double cost() {
        return weapon.cost() + 10.0;
    }
}
