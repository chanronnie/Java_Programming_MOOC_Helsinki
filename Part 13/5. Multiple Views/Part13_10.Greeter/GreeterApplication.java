package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) {
        
        // 1. Create the Main View
        // 1.1 Create the components 
        Label instructionsLabel = new Label("Enter your name and start.");
        TextField textField = new TextField("");
        Button startButton = new Button("Start");
        
        // 1.2 Layout the components
        GridPane layout = new GridPane();
        layout.add(instructionsLabel, 0, 0);
        layout.add(textField, 0, 1);
        layout.add(startButton, 0, 2);
        
        // 1.3 Style the layout
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        Scene mainView = new Scene(layout);
        
        // 2. Create the Greeting View once the "Start" button has been pressed
        // 2.1 Create the layout 
        Label greetingLabel = new Label("");
        
        StackPane greetingLayout = new StackPane();
        greetingLayout.setPrefSize(300, 180);
        greetingLayout.setAlignment(Pos.CENTER);
        greetingLayout.getChildren().add(greetingLabel);
        
        Scene greetingView = new Scene(greetingLayout);
        
        // Set the action
        startButton.setOnAction((event) -> {
            greetingLabel.setText("Welcome " + textField.getText() + "!");
            window.setScene(greetingView);
        });
        
        // Main view when launching the application
        window.setScene(mainView);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
