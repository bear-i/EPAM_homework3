package com.epam.State.States;

import com.epam.State.GrantOrder;

public class CreatedState implements GrantState {
    GrantOrder grantOrder;

    public CreatedState(GrantOrder grantOrder) {
        this.grantOrder = grantOrder;
        doAction();
    }

    @Override
    public void doAction() {
        System.out.println("Grant order of " + grantOrder.getStudent().getName() + " is created");
        grantOrder.setState(new ReviewedState(grantOrder));
        grantOrder.getState().doAction();
    }

    @Override
    public void printStatus() {
        System.out.println("Created.");
    }
}
