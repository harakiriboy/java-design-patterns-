package com.company.Adapter;

import com.company.Decorator.BaseDoctorTools;

public class DoctorKitTools implements MainKitTools{
    BaseDoctorTools baseDoctorTools = new BaseDoctorTools();
    AdapterTools adapterTools;

    @Override
    public void Tools(String specialization) {
        switch (specialization) {
            case "Doctor":
                System.out.println(baseDoctorTools.DisplayTools());
                break;
            case "Surgeon":
                adapterTools = new AdapterTools(new SurgeonKitTools());
                adapterTools.Tools(specialization);
                break;
            case "Neurologist":
                adapterTools = new AdapterTools(new NeurologistKitTools());
                adapterTools.Tools(specialization);
                break;
            default:
                System.out.println("Tools not enough!!!");
                break;
        }
    }
}
