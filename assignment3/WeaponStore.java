package com.company;

public class WeaponStore {
    public static void main(String[] args) {
        Weapon weapon = new Makarov();
        weapon = new Magazine(weapon);
        System.out.println(weapon.getDescription() + " $" + weapon.cost());

        Weapon weapon1 = new AWP();
        weapon1 = new Sight(weapon1);
        weapon1 = new Stock(weapon1);
        System.out.println(weapon1.getDescription() + " $" + weapon1.cost());

        Weapon weapon2 = new MiniGun();
        weapon2 = new Stock(weapon2);
        weapon2 = new Sight(weapon2);
        weapon2 = new Safety(weapon2);
        weapon2 = new Magazine(weapon2);
        System.out.println(weapon2.getDescription() + " $" + weapon2.cost());
    }
}
