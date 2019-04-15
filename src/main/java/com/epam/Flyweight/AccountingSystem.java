package com.epam.Flyweight;

import java.util.ArrayList;

public class AccountingSystem {
    ArrayList<String> accountingSystem = new ArrayList<>(250_000);

    public void addNewNotation(String notation){
        accountingSystem.add(notation);
    }

    public void showNotations(){
        System.out.println(accountingSystem);
    }
}
