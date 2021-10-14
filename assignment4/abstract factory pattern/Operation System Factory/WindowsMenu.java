package com.company;

public class WindowsMenu implements Menu {
    private final MenuTypes menutype;

    public WindowsMenu(MenuTypes menutype) {
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
