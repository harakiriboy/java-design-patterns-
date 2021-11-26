package com.company.Factory.Seeting;

public class BusSeating implements Seating {
    String modelOfSeating = "Bus seating";
    String AttendantSeating = "Driver chair on storage box with Sar6Lon Seatbelt";
    String CotMount = "Stryker";
    @Override
    public String InfoAboutSetting() {
        return "Model of seating: "+modelOfSeating+"\nAttendant seat: "+AttendantSeating+"\n" +
                "Cot mount: "+CotMount;
    }
}
