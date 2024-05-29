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

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.NumberAxis;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }
    
    @Override
    public void start(Stage stage) {
        
        // Create the higher level layout
        BorderPane layout = new BorderPane();
        
        // Create the axes and the line chart
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of years");
        yAxis.setLabel("Total Savings");
        
        LineChart lineChart = new LineChart(xAxis, yAxis);
        lineChart.setTitle("Savings calculator");

        // Create the "monthly savings" component
        SliderView monthlySavingsSetUp = new SliderView("Monthly savings", 25, 250, 25);
        BorderPane savingsComponent = monthlySavingsSetUp.getLayout();
        Label savingsValue = monthlySavingsSetUp.getDisplayedValue();
        Slider savingsSlider = monthlySavingsSetUp.getSlider();
        
        // Create the "interest rate" component
        SliderView interestRateSetUp = new SliderView("Yearly interest rate", 0, 10, 1); 
        BorderPane interestRateComponent = interestRateSetUp.getLayout();
        Label interestRateValue = interestRateSetUp.getDisplayedValue();
        Slider interestRateSlider = interestRateSetUp.getSlider();
        
        // Create the slider components
        VBox sliderComponents = new VBox();
        sliderComponents.getChildren().addAll(savingsComponent, interestRateComponent);
        
        // Place all the components in the general layout
        layout.setTop(sliderComponents);
        layout.setCenter(lineChart);

        // Connect the monthly savings slider with the line chart
        savingsSlider.valueProperty().addListener(event -> {
            
            // Update the displayed value on the right
            double monthlySavings = savingsSlider.getValue();
            savingsValue.setText(String.format("%.1f", monthlySavings));
            
            updateLineChart(monthlySavings, 0.0, lineChart);
        });
     
        
        // Connect the annual interest rate slider with the line chart to display two line charts
        interestRateSlider.valueProperty().addListener(event -> {
            
            // Update the displayed monthly savings value on the right
            double monthlySavings = savingsSlider.getValue();
            savingsValue.setText(String.format("%.1f", monthlySavings));
            
            // Update the displayed annual interest rate value on the right
            double annualInterestRate = interestRateSlider.getValue();
            interestRateValue.setText(String.format("%.1f", annualInterestRate));
            
            updateLineChart(monthlySavings, annualInterestRate, lineChart);
        });
        
        // Display the application
        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }
    
    public static void updateLineChart(double monthlySavings, double annualInterestRate, LineChart lineChart) {
                    
            // Reset the line chart
            lineChart.getData().clear();
            
            // Create the datasets for both savings options
            double accountValue;
            XYChart.Series savingsData = new XYChart.Series();
            savingsData.setName("Monthly Savings");
            
            double accountValueWithInterest = 0.0;
            XYChart.Series savingsWithInterestData = new XYChart.Series();
            savingsWithInterestData.setName("Interest Rate");
            
            for (int year = 0; year < 31; year++) {
                
                // Compute the total savings (without compound interest)
                accountValue = monthlySavings * 12 * year;
                savingsData.getData().add(new XYChart.Data(year, accountValue));
                
                // Compute the total savings with compound interest 
                if (year == 0) {
                    savingsWithInterestData.getData().add(new XYChart.Data(0, 0));
                    continue;
                }
                accountValueWithInterest += monthlySavings * 12;
                accountValueWithInterest *= 1.0 + annualInterestRate /100.0;
                savingsWithInterestData.getData().add(new XYChart.Data(year, accountValueWithInterest));
            }
            
            // Add the series to the line chart
            lineChart.getData().addAll(savingsData, savingsWithInterestData);
    }
}
