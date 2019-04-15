package com.epam.ChainOfResponsibility;

import com.epam.ChainOfResponsibility.handlers.PaymentHandler;

import java.util.ArrayList;
import java.util.List;

public class PaymentChain {
    List<PaymentHandler> handlerChain = new ArrayList<>();

    public List<PaymentHandler> getHandlerChain() {
        return handlerChain;
    }

    public void makeHandlerChain(PaymentHandler ... handlers) {
        for(PaymentHandler handler : handlers){
            handlerChain.add(handler);
        }
    }
}
