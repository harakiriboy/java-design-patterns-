package com.company;

public class WizardAdapter implements Fighter {
    private Wizard wizard;

    public WizardAdapter(Wizard wizard) {
        this.wizard = wizard;
    }

    @Override
    public void attack() {
        this.wizard.castDestructionSpell();
    }

    @Override
    public void defend() {
        this.wizard.shield();
    }

    @Override
    public void escape() {
        this.wizard.openPortal();
    }
}
