package com.epam.State.States;

import com.epam.State.GrantOrder;

public class ReviewedState implements GrantState{
    GrantOrder grantOrder;

    public ReviewedState(GrantOrder grantOrder) {
        this.grantOrder = grantOrder;
    }

    @Override
    public void doAction() {
        System.out.println("Grant order of "  + grantOrder.getStudent().getName() + " is reviewed...");
        try{
            int i = 0;
            while(i<3){
                Thread.currentThread().sleep(1500);
                System.out.println("In process...");
                i++;
            }
        }catch(InterruptedException e){
            System.out.println("Thread was interrupted");
        }
        if(grantOrder.getStudent().getAge()<18){
            grantOrder.setState(new DeniedState(grantOrder));
        } else{
            grantOrder.setState(new ConfirmedState(grantOrder));
        }
        grantOrder.getState().doAction();
    }

    @Override
    public void printStatus() {
        System.out.println("Is reviewed");
    }
}
