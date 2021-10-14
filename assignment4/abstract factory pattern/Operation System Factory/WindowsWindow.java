package com.company;

public class WindowsWindow implements Window {

    private final WindowTypes wintype;

    public WindowsWindow(WindowTypes wintype) {
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
