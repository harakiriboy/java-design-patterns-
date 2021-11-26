package com.company.Decorator;

public class Scalpel extends Tools{
    String toolName = "Scalpel";
    public Scalpel(DoctorToolBox tool) {
        super(tool);
    }

    @Override
    public String DisplayTools() {
        return super.DisplayTools()+toolName;
    }
}
