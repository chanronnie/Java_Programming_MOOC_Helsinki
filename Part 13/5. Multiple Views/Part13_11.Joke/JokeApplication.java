package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class JokeApplication extends Application {

    @Override
    public void start(Stage window) {
        
        // Create the buttons
        Button jokeButton = new Button("Joke");
        Button answerButton = new Button("Answer");
        Button explanationButton = new Button("Explanation");
        
        // Place the buttons in a horizontal layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setAlignment(Pos.CENTER);
        menu.setSpacing(10);
        menu.getChildren().addAll(jokeButton, answerButton, explanationButton);
        
        // Place the menu in the main view
        BorderPane mainLayout = new BorderPane();
        mainLayout.setTop(menu);
        
        // Create the different subview layouts
        StackPane jokeLayout = createLayout("What do you call a bear with no teeth?");
        StackPane answerLayout = createLayout("A gummy bear.");
        StackPane explanationLayout = createLayout("Self-explanatory!!!");
        
        // Set the button actions
        jokeButton.setOnAction((event) -> mainLayout.setCenter(jokeLayout));
        answerButton.setOnAction((event) -> mainLayout.setCenter(answerLayout));
        explanationButton.setOnAction((event) -> mainLayout.setCenter(explanationLayout));
        
        // Set the initial view
        mainLayout.setCenter(jokeLayout);
        Scene mainView = new Scene(mainLayout);
        window.setScene(mainView);
        window.show();
    }

    private StackPane createLayout(String content) {
        
        StackPane layout = new StackPane();
        layout.setPrefSize(100, 80);
        layout.getChildren().add(new Label(content));
        layout.setAlignment(Pos.CENTER);
        return layout;
    }
    
    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
