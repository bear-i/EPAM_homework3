package com.epam.RationalRose;

public class Motor {
    CoolingChamber coolingChamber;

    public Motor(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public void cool(){
        if(coolingChamber.getCurrentTemperature()>coolingChamber.getMaxTemperature()){
            coolingChamber.getFridge().getJournal().makeNotation("Motor on");
            coolingChamber.setCurrentTemperature(coolingChamber.getNormalTemperaturePercent()*coolingChamber.getMaxTemperature());
            coolingChamber.getFridge().getJournal().makeNotation("Motor off");
        }
    }
}
