package com.epam.ChainOfResponsibility;

import com.epam.ChainOfResponsibility.handlers.CheckAmount;
import com.epam.ChainOfResponsibility.handlers.CheckPersonality;
import com.epam.ChainOfResponsibility.handlers.PercentCompution;
import com.epam.ChainOfResponsibility.handlers.RightCheck;

public class Main {
    public static Server server = new Server();

    public static void init(){
        CheckPersonality checkPersonality = new CheckPersonality();
        RightCheck rightCheck = new RightCheck();
        PercentCompution percentCompution = new PercentCompution();
        CheckAmount checkAmount = new CheckAmount();

        checkPersonality.setNextHandler(rightCheck);
        rightCheck.setNextHandler(percentCompution);
        percentCompution.setNextHandler(checkAmount);

        PaymentChain paymentChain = new PaymentChain();
        paymentChain.makeHandlerChain(checkPersonality, rightCheck, percentCompution, checkAmount);
        server.setHandlerChain(paymentChain);
    }

    public static void main(String[] args) {
        init();

        PaymentData usualPayment = new PaymentData(3000, 1500, PaymentType.Usual);
        server.pay(usualPayment);

        PaymentData preferentialPayment = new PaymentData(4000, 2000, PaymentType.Preferential);
        server.pay(preferentialPayment);

        PaymentData interPayment = new PaymentData(7000, 6500, PaymentType.Interbank);
        server.pay(interPayment);
    }
}
