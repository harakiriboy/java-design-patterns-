package com.company.Factory.Doors;

public class HelicopterDoors implements Doors{
    String DoorModel = "Helicopter doors";
    String DoorHoldOpen = "Grabbers on rear doors";
    String Handles = "Handlcap style on all entry doors antimicrobial";
    @Override
    public String InfoAboutDoors() {
        return "Model of doors:"+DoorModel+";\nDoor hold open: "+DoorHoldOpen+";\nHandles: "+Handles+";";
    }
}
