package com.epam.ChainOfResponsibility.handlers;

import com.epam.ChainOfResponsibility.PaymentData;
import com.epam.ChainOfResponsibility.PaymentType;

public class PercentCompution implements PaymentHandler {
    private PaymentHandler handler;

    @Override
    public void setNextHandler(PaymentHandler handler) {
        this.handler = handler;
    }

    @Override
    public boolean process(PaymentData payment) {
        if(payment.getType()!= PaymentType.Preferential){
            double amount = payment.getAmountToPay() + payment.getAmountToPay()*0.1;
            payment.setAmountToPay(amount);
            return handler == null || handler.process(payment);
        } else{
            System.out.println("Preferential payment - no commission");
        }
        return handler==null || handler.process(payment);
    }
}
