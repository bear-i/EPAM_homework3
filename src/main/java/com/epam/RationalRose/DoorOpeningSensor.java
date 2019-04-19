package com.epam.RationalRose;

public class DoorOpeningSensor {
    private CoolingChamber coolingChamber;

    DoorOpeningSensor(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public CoolingChamber getCoolingChamber() {
        return coolingChamber;
    }

    public void setCoolingChamber(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public void observeDoor(CoolingChamber.Door coolingChamberDoor){
        if(coolingChamberDoor.isOpened()){
            coolingChamber.getTimer().checkTime();
            if(coolingChamberDoor.isOpened()){
                coolingChamber.getBeeper().makeSound();
            }
        }
    }
}
