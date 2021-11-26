package com.company.Factory.Cabinets;

public class BusCabinets implements Cabinets{
    String CabinetModel = "Bus Cabinets";
    String ActionAreaCabinet = "Laminated";
    String Laminate = "Dark Gray";
    String Polycarbonate = "Gray tinted or clear with full handles";
    String RfCabinets = "Wood doors with inside/outside access";
    @Override
    public String InfoAboutCabinets() {
        return "Cabinet model:"+CabinetModel+";\nAction area cabinet: "+ActionAreaCabinet+";\nLaminate: "+Laminate+";\n" +
                "Polycarbonate: "+Polycarbonate+";\nRF cabinet: "+RfCabinets;
    }
}
