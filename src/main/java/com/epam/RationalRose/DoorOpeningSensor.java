package com.epam.RationalRose;

public class DoorOpeningSensor {
    CoolingChamber coolingChamber;

    public DoorOpeningSensor(CoolingChamber coolingChamber) {
        this.coolingChamber = coolingChamber;
    }

    public void observeDoor(CoolingChamber.Door coolingChamberDoor){
        if(coolingChamberDoor.isOpened()){
            for(int i =0; i<1000; i++){

            }
            if(coolingChamberDoor.isOpened()){
                makeSound();
            }
        }
    }

    void makeSound(){
        System.out.println("Beep");
    }
}
