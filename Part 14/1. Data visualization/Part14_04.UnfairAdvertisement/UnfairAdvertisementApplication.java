/*
============== Java Programming II ==============
Part 14
Section 1 - Data visualization
Ex 4 - Unfair Advertisement


The application in the exercise template opens a visualization used for marketing for an imaginary company. 
The visualization displays the speed of their internet, and shows a remarkable difference to their competitors.
The comparison however is not really fair, and gives the wrong impression on the situation. 
Modify the program so, that the comparison is fairer.

Answer: To make the comparison fairer, we need to display the tick labels on the y-axis. 
This is done by setting yAxis.setTickLabelsVisible to be true.
=================================================
*/

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class UnfairAdvertisementApplication extends Application {

    @Override
    public void start(Stage window) {
        
        // Create the x, y axes
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis(77.0, 77.5, 0.1);
        yAxis.setTickLabelsVisible(true);
        yAxis.setLabel("Internet speed");

        // Create the bar chart
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Internet speed");
        barChart.setLegendVisible(false);

        // Create the dataset "speeds" for the speed internet
        XYChart.Series speeds = new XYChart.Series();
        speeds.getData().add(new XYChart.Data("NDA", 77.4));
        speeds.getData().add(new XYChart.Data("Fastie", 77.2));
        speeds.getData().add(new XYChart.Data("SuperNet", 77.1));
        speeds.getData().add(new XYChart.Data("Meganet", 77.1));

        // Display the bar chart
        barChart.getData().add(speeds);
        Scene view = new Scene(barChart, 400, 300);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(UnfairAdvertisementApplication.class);
    }

}
