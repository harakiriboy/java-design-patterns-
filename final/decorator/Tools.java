package com.company.Decorator;

import com.company.Decorator.DoctorToolBox;

public abstract class Tools implements DoctorToolBox {
    private final DoctorToolBox tool;

    public Tools(DoctorToolBox tool) {
        this.tool = tool;
    }

    public String DisplayTools(){
         return tool.DisplayTools();
    }
}
