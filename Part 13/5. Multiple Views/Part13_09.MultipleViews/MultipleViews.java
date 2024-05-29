package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    
    @Override
    public void start(Stage window) throws Exception {
        
        // Create the buttons
        Button firstViewButton = new Button("To the second view!");
        Button secondViewButton = new Button("To the third view!");
        Button thirdViewButton = new Button("To the first view!");
        
        // First view components
        BorderPane firstViewLayout = new BorderPane();
        firstViewLayout.setTop(new Label("First View!"));
        firstViewLayout.setCenter(firstViewButton);
        
        // Second view components
        VBox secondViewLayout = new VBox();
        secondViewLayout.getChildren().addAll(secondViewButton, new Label("Second view!"));
        
        // Third view components
        GridPane thirdViewLayout = new GridPane();
        thirdViewLayout.add(new Label("Third view!"), 0,0);
        thirdViewLayout.add(thirdViewButton, 1,1); 
        
        // Define the views
        Scene firstView = new Scene(firstViewLayout);
        Scene secondView = new Scene(secondViewLayout);
        Scene thirdView = new Scene(thirdViewLayout);
        
        // Set the actions
        firstViewButton.setOnAction((event)-> {
            window.setScene(secondView);
        });
        
        secondViewButton.setOnAction((event)-> {
            window.setScene(thirdView);
        });
                
        thirdViewButton.setOnAction((event)-> {
            window.setScene(firstView);
        });
        
        // Main page when launching the application
        window.setScene(firstView);
        window.show();   
    }

    // Main program
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}
