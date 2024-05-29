/*
============== Java Programming II ==============
Part 13
Section 5 - Multiple views
Ex 13 - Tic-tac-toe 


Implement a Tic-tac-toe game that uses a graphical user interface.
=================================================
*/

package ticTacToe;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class TicTacToe {
    
    // Private fields
    private char[][] board;
    private char player;
    private boolean endGame;
    private int filledBoxesCounter;
    
    // Constructor
    public TicTacToe() {
        this.board = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        this.player = 'X';
        this.endGame = false;
        this.filledBoxesCounter = 0;
    }
    
    public char getPlayer() {
        return this.player;
    }
    
    public void markPosition(GridPane gameBoard, Button button) {
        if (this.endGame) {
            return;
        } 
        
        if (!button.getText().equals(" ")) {
            return;
        } 
        
        // Place the symbol of current player if position has not been filled
        button.setText(String.valueOf(this.player));

        int row = gameBoard.getRowIndex(button);
        int col = gameBoard.getColumnIndex(button);
        this.board[row][col] = this.player;
        this.filledBoxesCounter++;
    }
    
    public String getGameStatus(GridPane gameBoard, Button button) {
        if (this.endGame) {
            return "The end!";
            
        } else if (isWinnerMove(gameBoard, button)) {
            return "Winner: " + this.player;
            
        } else if (this.filledBoxesCounter == 9) {
            return "It's a draw!";
            
        } else {
            // Change turn only if position has just been marked by the current player 
            if (button.getText().equals(String.valueOf(this.player))) {
                switchPlayer();
            }
            return "Turn: " + this.player;
        } 
    }
   
    private void switchPlayer() {
        if (this.player == 'X') {
            this.player = 'O';
        } else {
            this.player = 'X';
        }
    }
    
    public boolean isWinnerMove(GridPane gameBoard, Button button) {
        // Get the indices of the latest move
        int currRow = gameBoard.getRowIndex(button);
        int currCol = gameBoard.getColumnIndex(button);
       
        // Check if horizontal, vertical, diagonal lines have been marked by the same current player
        // Only check lines where the latest symbol has been placed
        if (hasHorizontalWin(currRow, currCol) || hasVerticalWin(currRow, currCol) || hasDiagonalWin(currRow, currCol)) {
            this.endGame = true;
            return true;
        }
        return false;
    }

    public boolean hasHorizontalWin(int currRow, int currCol) {
        // Get the column indices for the two other positions in the same row as the latest move
        int secondIndex = getNextIndex(currCol, 1);
        int thirdIndex = getNextIndex(currCol, 2);
        
        // Retrieve the values in the same row
        char currentValue = this.board[currRow][currCol];
        char secondValue = this.board[currRow][secondIndex];
        char thirdValue = this.board[currRow][thirdIndex];

        return (currentValue == secondValue && secondValue == thirdValue);
    }

    public boolean hasVerticalWin(int currRow, int currCol) {
        // Get the row indices for the two other positions in the same column as the latest move
        int secondIndex = getNextIndex(currRow, 1);
        int thirdIndex = getNextIndex(currRow, 2);
        
        // Retrieve the values in the same column
        char currentValue = this.board[currRow][currCol];
        char secondValue = this.board[secondIndex][currCol];
        char thirdValue = this.board[thirdIndex][currCol];
        
        return (currentValue == secondValue && secondValue == thirdValue);
    }
    
    public boolean hasDiagonalWin(int currRow, int currCol) {
        if (!isOnDiagonal(currRow, currCol)) {
            return false;
        }

        boolean winnerOnMainDiagonal = board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2];
        boolean winnerOnAntiDiagonal = board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0];
        return (winnerOnMainDiagonal || winnerOnAntiDiagonal);
    }
    
    private int getNextIndex(int currentIndex, int numberStep) {
        return (currentIndex + numberStep) % 3;
    }
    
    private boolean isOnDiagonal(int currRow, int currCol) {
        return (currRow == currCol) || (currRow + currCol == 2);
    }
}