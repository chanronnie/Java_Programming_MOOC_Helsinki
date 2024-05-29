/*
============== Java Programming II ==============
Part 14
Section 1 - Data visualization
Ex 1 - Shanghai


Reproduce the line chart using the provided dataset, following the instructions given.
=================================================
*/

package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }
    
    @Override
    public void start(Stage stage) {
        // Create the x, y axes
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 5);
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");    
        
        // Create the line chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Universiry Helsinki, Shangai ranking");
 
        // Create the data set
        XYChart.Series rankingData = new XYChart.Series();
        rankingData.setName("Helsinki Ranking");
        rankingData.getData().add(new XYChart.Data(2007, 73));
        rankingData.getData().add(new XYChart.Data(2008, 68));
        rankingData.getData().add(new XYChart.Data(2009, 72));
        rankingData.getData().add(new XYChart.Data(2010, 72));
        rankingData.getData().add(new XYChart.Data(2011, 74));
        rankingData.getData().add(new XYChart.Data(2012, 73));
        rankingData.getData().add(new XYChart.Data(2013, 76));
        rankingData.getData().add(new XYChart.Data(2014, 73));
        rankingData.getData().add(new XYChart.Data(2015, 67));
        rankingData.getData().add(new XYChart.Data(2016, 56));
        rankingData.getData().add(new XYChart.Data(2017, 56));
        
        // Add the dataset to the line chart
        lineChart.getData().add(rankingData);
        
        // Display the chart
        Scene view = new Scene(lineChart, 540, 400);
        stage.setScene(view);
        stage.show();
    }
}
