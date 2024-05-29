package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;

public class VocabularyPracticeApplication extends Application {

    private Dictionary dictionary;
    
    @Override
    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }
    
    @Override
    public void start(Stage window) throws Exception {
        
        // Create the higher level layout
        BorderPane mainLayout = new BorderPane();
        
        // Create the buttons
        Button enterButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");
        
        // Create the menu containing the buttons for the general layout
        HBox menu = new HBox();
        menu.setSpacing(10);
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.getChildren().addAll(enterButton, practiceButton);

        mainLayout.setTop(menu);
        
        // Create the subviews
        InputView inputView = new InputView(this.dictionary);
        PracticeView practiceView = new PracticeView(dictionary);

        // Connect the buttons with the subviews
        enterButton.setOnAction((event) -> {mainLayout.setCenter(inputView.getView());});
        practiceButton.setOnAction((event) -> {mainLayout.setCenter(practiceView.getView());});
        
        // Show the launched application
        mainLayout.setCenter(inputView.getView());
        Scene view = new Scene(mainLayout, 400, 300);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
