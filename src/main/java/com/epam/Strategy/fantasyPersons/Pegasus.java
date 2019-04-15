package com.epam.Strategy.fantasyPersons;

import com.epam.Strategy.strategies.MoveStrategy;
import com.epam.Strategy.strategies.MovementNames;

import java.util.Map;

public class Pegasus extends FantasyPerson {
    private final FantasyPersons name = FantasyPersons.Pegasus;

    @Override
    public Map<MovementNames, MoveStrategy> getMovements() {
        return super.getMovements();
    }

    @Override
    public void setMovements(Map<MovementNames, MoveStrategy> movements) {
        super.setMovements(movements);
    }

    @Override
    public FantasyPerson addMovements(MovementNames moveName, MoveStrategy moveStrategy) {
        super.addMovements(moveName, moveStrategy);
        return this;
    }

    @Override
    public void move(MovementNames moveName) {
        super.move(moveName);
    }

    @Override
    public void performAllMoves() {
        super.performAllMoves();
    }

    public FantasyPersons getName() {
        return name;
    }
}
