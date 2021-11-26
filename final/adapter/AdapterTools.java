package com.company.Adapter;

public class AdapterTools implements MainKitTools{
    SpecialKitTools specialKitTools;

    public AdapterTools(SpecialKitTools specialKitTools) {
        this.specialKitTools = specialKitTools;
    }

    @Override
    public void Tools(String specialization) {
        System.out.println(specialization+" tools: " + specialKitTools.DisplayTools());
    }
}
