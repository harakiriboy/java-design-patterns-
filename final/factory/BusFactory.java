package com.company.Factory;

import com.company.Factory.Body.Body;
import com.company.Factory.Body.BusBody;
import com.company.Factory.Cabinets.BusCabinets;
import com.company.Factory.Cabinets.Cabinets;
import com.company.Factory.Doors.BusDoors;
import com.company.Factory.Doors.Doors;
import com.company.Factory.Seeting.BusSeating;
import com.company.Factory.Seeting.Seating;

public class BusFactory extends Ambulance{
    @Override
    public Body createBody() {
        return new BusBody();
    }

    @Override
    public Cabinets createCabinets() {
        return new BusCabinets();
    }

    @Override
    public Doors createDoors() {
        return new BusDoors();
    }

    @Override
    public Seating createSeating() {
        return new BusSeating();
    }
}
