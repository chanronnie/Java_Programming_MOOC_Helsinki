/*
============== Java Programming II ==============
Part 14
Section 2 - Multimedia in programs
Ex 6 - Smiley


Create a graphical user interface into the class that is supplied with the exercise base. 
Add a BorderPane into the GUI to be responsible for the application's layout.
Add a Canvas object in the middle of the BorderPane. 
After doing this, use the GraphicsContext object of the Canvas object to draw a smiley. 
Use white (Color.WHITE) as the background color, and black (Color.BLACK) as the color of the smiley.
=================================================
*/

package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application {


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        
        // Create the layout
        BorderPane layout = new BorderPane();
        
        // Draw the smiley face on the canvas area
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext painter = canvas.getGraphicsContext2D();
        drawSmileyFace(painter);
        
        layout.setCenter(canvas);
        
        // Display the drawing
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }
    
    public static void drawSmileyFace(GraphicsContext painter) {
        // Draw the smiley face with GraphicsContext object using a black outline
        
        // Set the background color to white
        painter.setFill(Color.WHITE);
        
        // Draw the eyes
        painter.setFill(Color.BLACK);
        painter.fillRect(100, 100, 50, 50);    // left eye
        painter.fillRect(250, 100, 50, 50);    // right eye
        
        // Draw the smiley mouth
        painter.fillRect(50, 250, 50, 50);     // left dimple
        painter.fillRect(100, 300, 200, 50);   // mouth
        painter.fillRect(300, 250, 50, 50);    // right dimple
    }
}
