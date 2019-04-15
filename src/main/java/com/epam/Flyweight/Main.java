package com.epam.Flyweight;

public class Main {
    public static void main(String[] args) {
        Colony colony = new Colony(new BacteriumType(Form.Spherical, Move.Forward));
        AccountingSystem accountingSystem = new AccountingSystem();

        int sizeOfColony = colony.getSizeOfColony();
        while(sizeOfColony<500_000_000){
            colony.reproduction();
            String notation = "Size of colony growed to: " + colony.getSizeOfColony();
            accountingSystem.addNewNotation(notation);
            System.out.println(notation);
            sizeOfColony = colony.getSizeOfColony();
        }
    }
}
