package com.epam.Memento;

public class Board {
    static final int ROWS = 3;
    static final int COLS = 3;
    static BoardStore boardStore = new BoardStore();

    char[][] cells;
    int currentRow;
    int currentCol;

    public Board() {
        cells = new char[ROWS][COLS];
    }

    public Board(Board target){
        this.cells = new char[ROWS][COLS];
        newCellsArray(this.cells, target.cells);
        this.currentRow = target.currentRow;
        this.currentCol = target.currentCol;
    }

    public void init() {
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                cells[row][col] = '\u0020';
            }
        }
    }

    public boolean isDraw() {
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                if (cells[row][col] == '\u0020') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hasWon(char  theSeed) {
        return (cells[currentRow][0] == theSeed
                && cells[currentRow][1] == theSeed
                && cells[currentRow][2] == theSeed
                || cells[0][currentCol] == theSeed
                && cells[1][currentCol] == theSeed
                && cells[2][currentCol] == theSeed
                || currentRow == currentCol
                && cells[0][0] == theSeed
                && cells[1][1] == theSeed
                && cells[2][2] == theSeed
                || currentRow + currentCol == 2
                && cells[0][2] == theSeed
                && cells[1][1] == theSeed
                && cells[2][0] == theSeed);
    }

    public void paint() {
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                System.out.print(cells[row][col]);
                if (col < COLS - 1) System.out.print("|");
            }
                System.out.println();

        }
    }

    private Board cloneInstance(){
        return new Board(this);
    }

    private char[][] newCellsArray(char [][] newCells, char[][] cells) {
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                newCells[row][col] = cells[row][col];
            }
        }
        return newCells;
    }

    public void takeAShot(Board board){
        boardStore.addToStore(board.cloneInstance());
    }

    public void returnToPreviousState(){
        Board previousStateBoard = boardStore.getMemento();
        this.cells = previousStateBoard.cells;
        this.currentCol = previousStateBoard.currentCol;
        this.currentRow = previousStateBoard.currentRow;
    }
}

