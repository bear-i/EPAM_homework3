package com.epam.RationalRose;

public class TemperatureRegulator {
    private CoolingChamber coolingChamber;

    TemperatureRegulator(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public CoolingChamber getCoolingChamber() {
        return coolingChamber;
    }

    public void setCoolingChamber(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public void regulate(double temperature){
        coolingChamber.setMaxTemperature(temperature);
        coolingChamber.getFridge().getJournal().makeNotation("Maximum temperature was setted to " + temperature);
    }
}
