package buttonandlabel;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class ButtonAndLabelApplication extends Application {

    @Override 
    public void start(Stage window) {
        Button buttonComponent = new Button("Button Component");
        Label textComponent = new Label("Text Component");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(buttonComponent);
        componentGroup.getChildren().add(textComponent);
        
        Scene view = new Scene(componentGroup);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
