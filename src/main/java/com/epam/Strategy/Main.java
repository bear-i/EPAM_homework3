package com.epam.Strategy;

import com.epam.Strategy.fantasyPersons.*;
import com.epam.Strategy.strategies.*;

public class Main {
    public static void main(String[] args) {
        Vampire vampire = new Vampire();
        vampire.addMovements(MovementNames.Walking, new Walking())
                .addMovements(MovementNames.Running, new Running())
                .addMovements(MovementNames.Stalking, new Stalking());

        Elf elf = new Elf();
        elf.addMovements(MovementNames.Walking, new Walking())
                .addMovements(MovementNames.Running, new Running());

        Harpy harpy = new Harpy();
        harpy.addMovements(MovementNames.Flying, new Flying())
        .addMovements(MovementNames.Walking, new Walking());

        Orc orc = new Orc();
        orc.addMovements(MovementNames.Walking, new Walking());

        Pegasus pegasus = new Pegasus();
        pegasus.addMovements(MovementNames.Walking, new Walking())
                .addMovements(MovementNames.Running, new Running())
                .addMovements(MovementNames.Flying, new Flying());

        Troll troll = new Troll();
        troll.addMovements(MovementNames.Walking, new Walking());

        GroupOfPersons groupOfPersons = new GroupOfPersons(vampire, elf, harpy, orc, pegasus, troll);

        System.out.println("Vampire: ");
        vampire.performAllMoves();

        System.out.println("\nElf: ");
        elf.performAllMoves();

        System.out.println("\nHarpy: ");
        harpy.performAllMoves();

        System.out.println("\nOrc: ");
        orc.performAllMoves();

        System.out.println("\nPegasus: ");
        pegasus.performAllMoves();

        System.out.println("\nTroll: ");
        troll.performAllMoves();

        System.out.println("\nGroup of persons: ");
        groupOfPersons.performAllMoves();
        for(FantasyPerson person: groupOfPersons.getGroupOfFantasyPersons()){
            System.out.println(person.getName() + ":");
            person.performAllMoves();
        }
    }
}
