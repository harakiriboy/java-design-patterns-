package com.company.Decorator;

public class BaseDoctorTools implements DoctorToolBox{
    String Stethoscope = "Stethoscope";
    String Sphygmomanometer = "Sphygmomanometer";
    String Thermometer = "Thermometer";
    String CottonWool = "Cotton wool";
    String Plasters = "Plasters";
    String Pill = "Pill";
    String Bandage = "Compression Bandage";
    @Override
    public String DisplayTools() {
        return Stethoscope+", "+Sphygmomanometer+", "+Thermometer+", "+CottonWool+", " +
                Plasters+", "+Pill+", "+Bandage;
    }
}
