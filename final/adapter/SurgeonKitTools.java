package com.company.Adapter;

import com.company.Decorator.*;

public class SurgeonKitTools implements SpecialKitTools{
    Tools tools = new Scalpel(new BoneChisel(new PinCutter(new BaseDoctorTools())));

    @Override
    public String DisplayTools() {
        return tools.DisplayTools();
    }
}
