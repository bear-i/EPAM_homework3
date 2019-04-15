package com.epam.Memento;

import java.util.Scanner;

public class GameMain {
    private Board board;
    private GameState currentState;
    private char currentPlayer;

    private static Scanner in = new Scanner(System.in);

    public GameMain() {
        board = new Board();

        initGame();
        do {
            board.takeAShot(board);
            playerMove(currentPlayer);
            board.paint();
            updateGame(currentPlayer);
            if (currentState == GameState.CROSS_WON) {
                System.out.println("'X' won! Bye!");
            } else if (currentState == GameState.NOUGHT_WON) {
                System.out.println("'O' won! Bye!");
            } else if (currentState == GameState.DRAW) {
                System.out.println("It's Draw! Bye!");
            }
            currentPlayer = (currentPlayer == 'X') ? '0' : 'X';
            stepBackSuggest();
        } while (currentState == GameState.PLAYING);
    }

    private void stepBackSuggest() {
        System.out.println("Do you want to step back (y/n):");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.equals("y")){
            board.returnToPreviousState();
            currentPlayer = (currentPlayer == 'X') ? '0' : 'X';
            board.paint();
        }
    }

    public void initGame() {
        board.init();
        currentPlayer = 'X';
        currentState = GameState.PLAYING;
    }

    public void playerMove(char theSeed) {
        boolean validInput = false;  // for validating input
        do {
            if (theSeed == 'X') {
                System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
            } else {
                System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
            }
            int row = in.nextInt() - 1;
            int col = in.nextInt() - 1;
            if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS
                    && board.cells[row][col] == ' ') {
                board.cells[row][col]  = theSeed;
                board.currentRow = row;
                board.currentCol = col;
                validInput = true; // input okay, exit loop
            } else {
                System.out.println("This move at (" + (row + 1) + "," + (col + 1)
                        + ") is not valid. Try again...");
            }
        } while (!validInput);
    }

    public void updateGame(char theSeed) {
        if (board.hasWon(theSeed)) {
            currentState = (theSeed == 'X') ? GameState.CROSS_WON : GameState.NOUGHT_WON;
        } else if (board.isDraw()) {
            currentState = GameState.DRAW;
        }
    }

    public static void main(String[] args) {
        new GameMain();
    }
}


