/*
============== Java Programming II ==============
Part 14
Section 3 - Larger application: Asteroids
Ex 9 - Asteroids


Implement the Asteroids game by following the step-by-step examples. 
Make any additional changes if needed.
=================================================
*/

package asteroids;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class AsteroidsApplication extends Application {
    
    // Size of the screen
    public static int WIDTH = 300;
    public static int HEIGHT = 200;
    
    
    // Main program
    public static void main(String[] args) {
        launch(AsteroidsApplication.class);
    }
    
    @Override
    public void start(Stage window) throws Exception {
        
        // Create the layout 
        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);
        
        // Show the application
        Scene scene = new Scene(pane);     
        window.setTitle("Asteroids!");
        window.setScene(scene);
        window.show();
        
        // Run the game
        GameLogic gameLogic = new GameLogic(pane, scene);
        gameLogic.runGame();
    } 

    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 4;
    }
}
