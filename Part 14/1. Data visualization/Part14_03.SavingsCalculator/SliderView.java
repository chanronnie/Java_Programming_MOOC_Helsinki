/*
============== Java Programming II ==============
Part 14
Section 1 - Data visualization
Ex 3 - Savings calculator


Implement a program for calculating and displaying the sum in a savings account. 
User can give the calculator a sum to save each month and the yearly interest rate, 
and the calculator will display how the savings will increase over 30 years.
=================================================
*/

package application;

import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class SliderView {
   
    // Private fields
    private Label sliderLabel;
    private Label displayedValue;
    private Slider slider;
    
    // Constructor
    public SliderView(String sliderLabel, int minValue, int maxValue, int units) {
        this.sliderLabel = new Label(sliderLabel);
        this.slider = new Slider(minValue, maxValue, units);
        this.slider.setValue(minValue);
        this.displayedValue = new Label(String.format("%.1f", this.slider.getValue()));
    }
    
    public BorderPane getLayout() {
        
        // Create the higher level layout
        BorderPane layout = new BorderPane();

        // Style the slider
        this.slider.setShowTickLabels(true);
        this.slider.setShowTickMarks(true);
        
        // Place the components in the main layout
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setLeft(this.sliderLabel);
        layout.setCenter(this.slider);
        layout.setRight(this.displayedValue);
        
        return layout;
    }
    
    public Slider getSlider() {
        return this.slider;
    }
    
    public Label getDisplayedValue() {
        return this.displayedValue;
    }
    
}
