package com.epam.RationalRose;

public class Indicator {
    private CoolingChamber coolingChamber;

    Indicator(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public CoolingChamber getCoolingChamber() {
        return coolingChamber;
    }

    public void setCoolingChamber(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public void showTemperature(){
        System.out.println(coolingChamber.getCurrentTemperature());
    }
}
