package com.company.Decorator;

public class PinCutter extends Tools {
    String toolName = "PinCutter";
    public PinCutter(DoctorToolBox tool) {
        super(tool);
    }

    @Override
    public String DisplayTools() {
        return super.DisplayTools()+toolName;
    }
}
