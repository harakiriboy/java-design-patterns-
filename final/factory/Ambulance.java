package com.company.Factory;

import com.company.Factory.Body.Body;
import com.company.Factory.Cabinets.Cabinets;
import com.company.Factory.Doors.Doors;
import com.company.Factory.Seeting.Seating;

public abstract class Ambulance {

    public abstract Body createBody();
    public abstract Cabinets createCabinets();
    public abstract Doors createDoors();
    public abstract Seating createSeating();

}
