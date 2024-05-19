package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        
        // Create the components
        TextArea textArea = new TextArea();
        Label lettersLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestWordLabel = new Label("The longest word is: ");
        
        HBox statisticsComponent = new HBox();
        statisticsComponent.setSpacing(10);
        statisticsComponent.getChildren().add(lettersLabel);
        statisticsComponent.getChildren().add(wordsLabel);
        statisticsComponent.getChildren().add(longestWordLabel);
        
        // Put the elements in the layout BorderPane
        BorderPane componentGroup = new BorderPane();
        componentGroup.setCenter(textArea);
        componentGroup.setBottom(statisticsComponent);
        
        // Set the event 
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            // Get the statistics
            int nbLetters = newValue.length();
            String[] allWords = newValue.split(" ");
            String longest = Arrays.stream(allWords)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            // Update the label values 
            lettersLabel.setText("Letters: " + nbLetters);
            wordsLabel.setText("Words: " + allWords.length);
            longestWordLabel.setText("The longest word is: " + longest);
        });
        
        Scene view = new Scene(componentGroup);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}
