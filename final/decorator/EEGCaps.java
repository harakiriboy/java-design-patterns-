package com.company.Decorator;

public class EEGCaps extends Tools {
    String toolName = "EEGCaps";
    public EEGCaps(DoctorToolBox tool) {
        super(tool);
    }

    @Override
    public String DisplayTools() {
        return super.DisplayTools()+toolName;
    }
}
