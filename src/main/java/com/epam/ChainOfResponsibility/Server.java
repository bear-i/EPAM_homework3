package com.epam.ChainOfResponsibility;

public class Server {
    PaymentChain handlerChain;

    public void pay(PaymentData payment){
        if(handlerChain.getHandlerChain().get(0).process(payment)){
            payment.setAmountOnAccount(payment.getAmountOnAccount() - payment.getAmountToPay());
            System.out.println("Your payment is successful");
        }else{
            System.out.println("Your payment failed");
        }
    }

    public PaymentChain getHandlerChain() {
        return handlerChain;
    }

    public void setHandlerChain(PaymentChain handlerChain) {
        this.handlerChain = handlerChain;
    }
}
