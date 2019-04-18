package com.epam.RationalRose;

public class TemperatureRegulator {
    CoolingChamber coolingChamber;

    public TemperatureRegulator(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public void regulate(double temperature){
        coolingChamber.setMaxTemperature(temperature);
        coolingChamber.getFridge().getJournal().makeNotation("Maximum temperature was setted to " + temperature);
    }
}
