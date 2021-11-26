package com.company.Factory.Body;

public class BusBody implements Body{
    String BodyModel = "Ambulance Bus";
    String Flooring = "Platinum Transit";
    String Headlines = "One-piece front to rear, gloss white";
    String Paint = "OEM White";
    String Top = "AEV Fiberglass distinctive design (GM)";
    @Override
    public String InfoAboutBody() {
        return "Body Model: "+BodyModel+";\nFlooring: "+Flooring+";" +
                ";\nHeadlines: "+Headlines+";\nPaint: "+Paint+";\n Top: "+Top+";";
    }
}
