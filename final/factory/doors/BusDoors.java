package com.company.Factory.Doors;

public class BusDoors implements Doors{
    String DoorModel = "Bus doors";
    String DoorHoldOpen = "Grabbers on rear doors";
    String Handles = "Handlcap style on all entry doors antimicrobial";
    @Override
    public String InfoAboutDoors() {
        return "Model of doors:"+DoorModel+";\nDoor hold open: "+DoorHoldOpen+";\nHandles: "+Handles+";";
    }
}
