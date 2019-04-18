package com.epam.RationalRose;

public class Termometer {
    CoolingChamber coolingChamber;

    public Termometer(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public double takeTheTemperature(){
        return coolingChamber.getCurrentTemperature();
    }
}
