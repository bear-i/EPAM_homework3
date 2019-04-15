package com.epam.ChainOfResponsibility.handlers;

import com.epam.ChainOfResponsibility.PaymentData;
import com.epam.ChainOfResponsibility.PaymentType;

public class CheckPersonality implements PaymentHandler {
    private PaymentHandler handler;

    @Override
    public void setNextHandler(PaymentHandler handler) {
        this.handler = handler;
    }

    @Override
    public boolean process(PaymentData payment) {
        if(payment.getType()!= PaymentType.Interbank){
            System.out.println("Your personality was confirmed");
        } else{
            System.out.println("Interbank operation - no need for authentification");
        }
        return handler == null || handler.process(payment);
    }
}
