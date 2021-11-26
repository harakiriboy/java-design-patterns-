package com.company.Decorator;

public class BoneChisel extends Tools{
    String toolName = "BoneChisel";
    public BoneChisel(DoctorToolBox tool) {
        super(tool);
    }

    @Override
    public String DisplayTools() {
        return super.DisplayTools()+toolName;
    }
}
