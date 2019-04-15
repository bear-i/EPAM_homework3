package com.epam.State.States;

import com.epam.State.GrantOrder;

public class DeniedState implements GrantState {
    GrantOrder grantOrder;

    public DeniedState(GrantOrder grantOrder) {
        this.grantOrder = grantOrder;
    }

    @Override
    public void doAction() {
        System.out.println("Grant order of " + grantOrder.getStudent().getName() +
                " was denied, because his age is under 18");
    }

    @Override
    public void printStatus() {
        System.out.println("DeniedState.");
    }
}
