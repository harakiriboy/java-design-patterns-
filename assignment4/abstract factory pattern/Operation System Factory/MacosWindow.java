package com.company;

public class MacosWindow implements Window {

    private final WindowTypes wintype;

    public MacosWindow(WindowTypes wintype) {
        this.wintype = wintype;
    }

    @Override
    public WindowTypes getWindowType() {
        return null;
    }

    @Override
    public String toString() {
        return ""+wintype;
    }

}
