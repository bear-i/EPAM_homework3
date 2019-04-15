package com.epam.Flyweight;

public class BacteriumType {
    private Form form;
    private Move moves;

    public BacteriumType(Form form, Move moves) {
        this.form = form;
        this.moves = moves;
    }

    public int grow(int length){
        if(length>5){
            return length;
        } else{
            return length++;
        }
    }
}
