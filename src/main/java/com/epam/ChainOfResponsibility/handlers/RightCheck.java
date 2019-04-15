package com.epam.ChainOfResponsibility.handlers;

import com.epam.ChainOfResponsibility.PaymentData;

public class RightCheck implements PaymentHandler {
   private  PaymentHandler handler;

    @Override
    public void setNextHandler(PaymentHandler handler) {
        this.handler = handler;
    }

    @Override
    public boolean process(PaymentData payment) {
        System.out.println("Your rights for this operation confirmed");
        return handler == null || handler.process(payment);
    }
}
