package com.company;

public class HealerAdapter implements Fighter {
    private Healer healer;

    public HealerAdapter(Healer healer) {
        this.healer = healer;
    }

    @Override
    public void attack() {
        this.healer.createmedicine();
    }

    @Override
    public void defend() {
        this.healer.healfighter();
    }

    @Override
    public void escape() {
        this.healer.createsmokeball();
    }
}
