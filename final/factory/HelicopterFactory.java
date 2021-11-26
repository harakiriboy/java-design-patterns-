package com.company.Factory;

import com.company.Factory.Body.Body;
import com.company.Factory.Body.HelicopterBody;
import com.company.Factory.Cabinets.Cabinets;
import com.company.Factory.Cabinets.HelicopterCabinets;
import com.company.Factory.Doors.Doors;
import com.company.Factory.Doors.HelicopterDoors;
import com.company.Factory.Seeting.HelicopterSeating;
import com.company.Factory.Seeting.Seating;

public class HelicopterFactory extends Ambulance{
    @Override
    public Body createBody() {
        return new HelicopterBody();
    }

    @Override
    public Cabinets createCabinets() {
        return new HelicopterCabinets();
    }

    @Override
    public Doors createDoors() {
        return new HelicopterDoors();
    }

    @Override
    public Seating createSeating() {
        return new HelicopterSeating();
    }
}
