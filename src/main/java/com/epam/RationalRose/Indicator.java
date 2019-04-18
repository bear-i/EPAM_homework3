package com.epam.RationalRose;

public class Indicator {
    CoolingChamber coolingChamber;

    public Indicator(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public void showTemperature(){
        System.out.println(coolingChamber.getCurrentTemperature());
    }
}
