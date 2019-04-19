package com.epam.RationalRose;

public class Termometer {
    private CoolingChamber coolingChamber;

    Termometer(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public CoolingChamber getCoolingChamber() {
        return coolingChamber;
    }

    public void setCoolingChamber(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public double takeTheTemperature(){
        return coolingChamber.getCurrentTemperature();
    }
}
