package com.epam.RationalRose;

public class Beeper {
    private CoolingChamber coolingChamber;

    public Beeper(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public CoolingChamber getCoolingChamber() {
        return coolingChamber;
    }

    public void setCoolingChamber(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public void makeSound(){
        System.out.println("Beep");
    }
}
