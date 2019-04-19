package com.epam.RationalRose;

public class Timer {
    private CoolingChamber coolingChamber;

    Timer(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public CoolingChamber getCoolingChamber() {
        return coolingChamber;
    }

    public void setCoolingChamber(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public void checkTime(){

    }
}
