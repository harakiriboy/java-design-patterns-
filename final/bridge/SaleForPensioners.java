package com.company.Bridge;

public class SaleForPensioners implements Price {
    @Override
    public void setPrice() {
        System.out.println("Sale for Pensioners");
    }
}
