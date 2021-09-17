package com.company;

public abstract class Ninja {
    private FireJutsu fireJutsu;
    private WeaponJutsu weaponJutsu;

    public Ninja(FireJutsu fireJutsu, WeaponJutsu weaponJutsu) {
        this.fireJutsu = fireJutsu;
        this.weaponJutsu = weaponJutsu;
    }

    public void performBlowing() {
        this.fireJutsu.blowup();
    }

    public void performThrowing() {
        this.weaponJutsu.throww();
    }

    public abstract void warning();

    public void setFireJutsu(FireJutsu fireJutsu) {
        this.fireJutsu = fireJutsu;
    }

    public void setWeaponJutsu(WeaponJutsu weaponJutsu) {
        this.weaponJutsu = weaponJutsu;
    }

    public FireJutsu getFireJutsu() {
        return fireJutsu;
    }

    public WeaponJutsu getWeaponJutsu() {
        return weaponJutsu;
    }
}
