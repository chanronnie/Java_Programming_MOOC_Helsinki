/*
============== Java Programming II ==============
Part 14
Section 1 - Data visualization
Ex 2 - Finnish parties


Reproduce the line chart using the provided dataset "partiesdata.tsv", following the instructions given.
=================================================
*/

package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        // Create the x, y axes
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support");
        
        // Create the line chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        
        // Create the dataset
        Map<String, Map<Integer, Double>> values = createDatasetFromFile("partiesdata.tsv");
        values.keySet().stream().forEach(party -> {
            
            XYChart.Series data = new XYChart.Series();
            data.setName(party);
            
            values.get(party).entrySet().stream().forEach(pair -> data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue())));
            
            lineChart.getData().add(data);
        });

 
        // Display the chart
        Scene view = new Scene(lineChart);
        stage.setScene(view);
        stage.show();
    }
    
    
    public static List<String> getDataFromFile(String fileName) {
        try {
            return Files.lines(Paths.get(fileName)).collect(Collectors.toList());

        } catch (IOException e) {
            System.out.println("Cannot open the file " + fileName);
        }
        return null;
    }
    
    
    public static Map<String, Map<Integer, Double>> createDatasetFromFile(String fileName) {
        
        // Read data from given file
        Map<String, Map<Integer, Double>> values = new HashMap<>();
        List<String> rows = getDataFromFile(fileName);
        
        // Retrieve years
        String[] years = rows.get(0).split("\t");
        
        // Process the raw data line by line
        for (int row = 1; row < rows.size(); row++) {
            String[] singlePartyData = rows.get(row).split("\t");
            String partyName = singlePartyData[0];
            Map<Integer, Double> points = new HashMap<>();
            
            // Pair each relative support value with its corresponding year
            for (int col = 1; col < singlePartyData.length; col++) {
                if (singlePartyData[col].equals("-")) {
                    continue;
                }
                
                // Retrieve data and add it to the inner hash map "points" 
                int year = Integer.valueOf(years[col]);
                double relativeSupport = Double.valueOf(singlePartyData[col]);
                points.put(year, relativeSupport);
            }
            // Add the party data to the outer hash map "dataset"
            values.put(partyName, points);
        }
        return values;
    }
}
