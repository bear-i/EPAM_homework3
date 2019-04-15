package com.epam.State.States;

import com.epam.State.GrantOrder;

public class ConfirmedState implements GrantState {
    GrantOrder grantOrder;

    public ConfirmedState(GrantOrder grantOrder) {
        this.grantOrder = grantOrder;
    }

    @Override
    public void doAction() {
        System.out.println("Congratulation, order of " + grantOrder.getStudent().getName() + " was confirmed!");
    }

    @Override
    public void printStatus() {
        System.out.println("Confirmed");
    }
}
