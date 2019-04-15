package com.epam.Memento;

import java.util.LinkedList;

public class BoardStore {
    LinkedList<Board> boardMementos = new LinkedList<>();

    public void addToStore(Board boardMemento){
        boardMementos.add(boardMemento);
    }

    public Board getMemento(){
        Board board = boardMementos.getLast();
        boardMementos.removeLast();
        return board;
    }
}
