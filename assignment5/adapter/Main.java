package com.company;

public class Main {
    public static void main(String args[]) {
        Fighter samurai = new Samurai();
        Healer healer = new Healer();
        HealerAdapter healeradapter = new HealerAdapter(healer);
        Wizard wizard = new Wizard();
        WizardAdapter wizardAdapter = new WizardAdapter(wizard);

        System.out.println("-----Samurai's Action------");
        samurai.attack();
        samurai.defend();
        samurai.escape();

        System.out.println("\n-----Healer's Action------");
        healeradapter.attack();
        healeradapter.defend();
        healeradapter.escape();

        System.out.println("\n-----Wizard's Action------");
        wizardAdapter.attack();
        wizardAdapter.defend();
        wizardAdapter.escape();
    }
}
