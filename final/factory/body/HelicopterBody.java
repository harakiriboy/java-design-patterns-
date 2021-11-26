package com.company.Factory.Body;

public class HelicopterBody implements Body{
    String BodyModel = "Ambulance Helicopter";
    String Flooring = "Hangar floor coating";
    String Headlines = "Two-piece front to rear, gloss dark";
    String Paint = "OEM Green";
    String Top = "PlyWood, single piece, full length and width";
    @Override
    public String InfoAboutBody() {
        return "Body Model: "+BodyModel+";\nFlooring: "+Flooring+";" +
                ";\nHeadlines: "+Headlines+";\nPaint: "+Paint+";\n Top: "+Top+";";
    }
}
