package com.epam.ChainOfResponsibility;

public class PaymentData {
    private double amountOnAccount;
    private double amountToPay;
    private PaymentType type;

    public PaymentData(double amountOnAccount, double amountToPay, PaymentType type) {
        this.amountOnAccount = amountOnAccount;
        this.amountToPay = amountToPay;
        this.type = type;
    }

    public double getAmountOnAccount() {
        return amountOnAccount;
    }

    public void setAmountOnAccount(double amountOnAccount) {
        this.amountOnAccount = amountOnAccount;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }
}
