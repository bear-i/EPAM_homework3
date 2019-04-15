package com.epam.State;

public class Main {
    public static void main(String[] args) {
        Student Jack = new Student("Jack", 16);
        Jack.createGrantOrder();

        Student April = new Student("April", 21);
        April.createGrantOrder();
    }
}
