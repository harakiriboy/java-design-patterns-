package com.company.Observer;
import com.company.Bridge.Citramon;
import com.company.Bridge.FreeForKids;
import com.company.Bridge.Medicament;
import com.company.Bridge.SaleForPensioners;
import com.company.Facade;
import com.company.Strategy.*;

public class Runner {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.ruuun();
    }
}
