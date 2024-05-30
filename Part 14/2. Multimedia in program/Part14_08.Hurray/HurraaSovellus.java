/*
============== Java Programming II ==============
Part 2
Section 2 - Multimedia in programs
Ex 8 - Hurray


Implement a graphical user interface with a button "Hurray!".
When the user clicks the button, the sound from the audio file should be played.
=================================================
*/

package hurraa;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.AudioClip;


public class HurraaSovellus extends Application {

    public static void main(String[] args) {
        launch(HurraaSovellus.class);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        // Create the components
        Button button = new Button("Hurray!");
        AudioClip sound = new AudioClip("file:Applause-Yannick_Lemieux.wav");
        
        // Create the layout
        BorderPane layout = new BorderPane();
        layout.setCenter(button);
        
        // Connect the button with the audio file
        button.setOnMouseClicked(event -> {
            sound.play();
        });
            
        // Show the application
        Scene view = new Scene(layout, 500, 400);
        stage.setScene(view);
        stage.show();
    }
}
