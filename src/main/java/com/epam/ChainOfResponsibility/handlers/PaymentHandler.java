package com.epam.ChainOfResponsibility.handlers;

import com.epam.ChainOfResponsibility.PaymentData;

public interface PaymentHandler {
    void setNextHandler(PaymentHandler handler);
    boolean process(PaymentData payment);
}
