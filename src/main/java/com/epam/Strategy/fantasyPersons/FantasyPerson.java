package com.epam.Strategy.fantasyPersons;

import com.epam.Strategy.strategies.MoveStrategy;
import com.epam.Strategy.strategies.MovementNames;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class FantasyPerson {
    Map<MovementNames, MoveStrategy> movements = new HashMap<>();

    public Map<MovementNames, MoveStrategy> getMovements() {
        return movements;
    }

    public void setMovements(Map<MovementNames, MoveStrategy> movements) {
        this.movements = movements;
    }

    public FantasyPerson addMovements(MovementNames moveName, MoveStrategy moveStrategy){
        movements.put(moveName, moveStrategy);
        return this;
    }

    public void move(MovementNames moveName){
        try{
            movements.get(moveName).move();
        }catch(NullPointerException e){
            System.out.println("This fantasy person can't do such a movement");
        }
    }

    public void performAllMoves(){
        Set<MovementNames> moveNames = movements.keySet();
        for(MovementNames move: moveNames){
            movements.get(move).move();
        }
    }

    public abstract FantasyPersons getName();
}
