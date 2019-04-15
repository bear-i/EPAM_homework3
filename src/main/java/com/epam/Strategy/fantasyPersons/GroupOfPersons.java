package com.epam.Strategy.fantasyPersons;

import com.epam.Strategy.strategies.FlyUsingMagic;
import com.epam.Strategy.strategies.MoveStrategy;
import com.epam.Strategy.strategies.MovementNames;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GroupOfPersons extends FantasyPerson {
    private final FantasyPersons name = FantasyPersons.Group;
    Set<FantasyPerson> groupOfFantasyPersons = new HashSet<>();

    public  GroupOfPersons(FantasyPerson ... persons){
        super.addMovements(MovementNames.FlyingWithMagic, new FlyUsingMagic());
        for(FantasyPerson person: persons){
            groupOfFantasyPersons.add(person);
        }
    }

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

    @Override
    public FantasyPersons getName() {
        return name;
    }

    public Set<FantasyPerson> getGroupOfFantasyPersons() {
        return groupOfFantasyPersons;
    }

    public void setGroupOfFantasyPersons(Set<FantasyPerson> groupOfFantasyPersons) {
        this.groupOfFantasyPersons = groupOfFantasyPersons;
    }
}
