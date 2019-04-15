package com.epam.ChainOfResponsibility.handlers;

import com.epam.ChainOfResponsibility.PaymentData;

public class CheckAmount implements PaymentHandler {
    private PaymentHandler handler;

    @Override
    public void setNextHandler(PaymentHandler handler) {
        this.handler = handler;
    }

    @Override
    public boolean process(PaymentData payment) {
        if(payment.getAmountOnAccount()<payment.getAmountToPay()){
            System.out.println("Not enough money fot this operation.");
            return false;
        }else{
            return handler==null || handler.process(payment);
        }
    }
}
