package com.company.Adapter;

import com.company.Decorator.Balloon;
import com.company.Decorator.BaseDoctorTools;
import com.company.Decorator.EEGCaps;
import com.company.Decorator.Tools;

public class NeurologistKitTools implements SpecialKitTools{
    Tools tools = new Balloon(new EEGCaps(new BaseDoctorTools()));

    @Override
    public String DisplayTools() {
        return tools.DisplayTools();
    }
}
