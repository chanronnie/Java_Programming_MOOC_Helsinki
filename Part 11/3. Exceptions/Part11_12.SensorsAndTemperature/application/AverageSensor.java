/*
============== Java Programming II ==============
Part 11
Section 3 - Exzceptions
Ex 12 - Sensors and temperature


Implement a program using interface, classes and Exception.
=================================================
*/

package application;

import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
 
    @Override 
    public boolean isOn() {
        for (Sensor s: this.sensors) {
            if (!s.isOn()) {
              return false;  
            }
        }
        return true;

    }
    
    @Override 
    public void setOn() {
        this.sensors.stream().forEach(sensor -> sensor.setOn());
    }
    
    @Override 
    public void setOff() {
        this.sensors.stream().forEach(sensor -> sensor.setOff());
    }
    
    @Override
    public int read() {
        if (this.sensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException();
        }
        
        int sum = 0;
        for (Sensor s: this.sensors) {
            sum += s.read();
        }
        int average = sum/this.sensors.size();
        this.readings.add(average);
        return average;
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
}
