package com.company.Factory.Seeting;

public class HelicopterSeating implements Seating {
    String modelOfSeating = "Helicopter seating";
    String AttendantSeating = "Pilot chair on storage box with Per4Max Seatbit";
    String CotMount = "Ferno";
    @Override
    public String InfoAboutSetting() {
        return "Model of seating: "+modelOfSeating+"\nAttendant seat: "+AttendantSeating+"\n" +
                "Cot mount: "+CotMount;
    }
}
