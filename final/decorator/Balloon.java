package com.company.Decorator;


public class Balloon extends Tools {
    String toolName = "Balloon";

    public Balloon(DoctorToolBox tool) {
        super(tool);
    }

    @Override
    public String DisplayTools() {
        return super.DisplayTools()+toolName;
    }
}
