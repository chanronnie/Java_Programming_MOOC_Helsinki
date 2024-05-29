/*
============== Java Programming II ==============
Part 13
Section 5 - Multiple views
Ex 13 - Tic-tac-toe 


Implement a Tic-tac-toe game that uses a graphical user interface.
=================================================
*/

package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class TicTacToeApplication extends Application {
    
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        TicTacToe game = new TicTacToe();
        
        // Create the higher level layout
        BorderPane layout = new BorderPane();
        
        // Create the message board
        Label messageBoard = new Label("Turn: " + game.getPlayer());
        messageBoard.setFont(Font.font("Monospaced", 25));
        
        // Create the board game 
        GridPane gameBoard = new GridPane();
        gameBoard.setVgap(10);
        gameBoard.setHgap(10);
        gameBoard.setPadding(new Insets(10, 10, 10, 10));
        
        // Create tic-tac-toe grid with the buttons
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                
                Button button = new Button(" ");
                button.setFont(Font.font("Monospaced", 40));
                
                button.setOnAction((event) -> {
                    
                    game.markPosition(gameBoard, button);
                    messageBoard.setText(game.getGameStatus(gameBoard, button));

                });
                
                // Add the button to the gameBoard
                gameBoard.add(button, row, col);
            }
        }

        // Place the components in the layout
        layout.setTop(messageBoard);
        layout.setCenter(gameBoard);
        
        // Show the application
        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }
}
