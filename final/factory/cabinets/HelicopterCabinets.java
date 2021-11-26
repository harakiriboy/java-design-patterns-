package com.company.Factory.Cabinets;

public class HelicopterCabinets implements Cabinets{
    String CabinetModel = "Helicopter Cabinets";
    String ActionAreaCabinet = "Laminated countertop";
    String Laminate = "Dark Green";
    String Polycarbonate = "Curb side, at head of squad bench";
    String RfCabinets = "For storage of Lifepak and Drug boxes";
    @Override
    public String InfoAboutCabinets() {
        return "Cabinet model:"+CabinetModel+";\nAction area cabinet: "+ActionAreaCabinet+";\nLaminate: "+Laminate+";\n" +
                "Polycarbonate: "+Polycarbonate+";\nRF cabinet: "+RfCabinets;
    }
}
