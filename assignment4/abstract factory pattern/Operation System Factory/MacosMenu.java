package com.company;

public class MacosMenu implements Menu {

    private final MenuTypes menutype;

    public MacosMenu(MenuTypes menutype) {
        this.menutype = menutype;
    }

    @Override
    public MenuTypes getMenuType() {
        return null;
    }

    @Override
    public String toString() {
        return ""+menutype;
    }
}
