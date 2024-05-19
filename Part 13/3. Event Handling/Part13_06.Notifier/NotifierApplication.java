package notifier;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class NotifierApplication extends Application {

    @Override
    public void start(Stage window) {
        TextField inputText = new TextField();
        Button button = new Button("Update");
        Label bottomText = new Label();
        
        button.setOnAction((event) -> {
            bottomText.setText(inputText.getText());
        });
        
        VBox layout = new VBox();
        layout.getChildren().addAll(inputText, button, bottomText);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }
}
