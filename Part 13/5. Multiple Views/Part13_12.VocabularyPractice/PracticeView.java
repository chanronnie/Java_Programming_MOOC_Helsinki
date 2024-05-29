
package application;

import javafx.scene.Parent;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class PracticeView {
    
    private Dictionary dictionary;
    private String word;
    
    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = this.dictionary.getRandomWord();
    }
    
    public Parent getView() {
        
        // Create the components
        Label instruction = new Label("Translate the word '" + this.word + "'");
        TextField answerField = new TextField();
        Button checkButton = new Button("Check");
        Label feedback = new Label();
        
        // Place the components in the layout
        GridPane layout = new GridPane();
        layout.add(instruction, 0, 0);
        layout.add(answerField, 0, 1);
        layout.add(checkButton, 0, 2);
        layout.add(feedback, 0, 3);
        
        // Style the layout
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        // Set the action of the button
        checkButton.setOnAction((event) -> {

            // Check the answer with a feedback
            String correctTranslation = this.dictionary.get(this.word);
            if (answerField.getText().equals(correctTranslation)) {
                feedback.setText("Correct!");
            } else {
                feedback.setText("Incorrect!");
            }
            
            // Refresh the practice instruction with another word
            this.word = this.dictionary.getRandomWord();
            instruction.setText("Translate the word '" + this.word + "'");
            answerField.clear();
        });
        
        return layout;
    }
}
