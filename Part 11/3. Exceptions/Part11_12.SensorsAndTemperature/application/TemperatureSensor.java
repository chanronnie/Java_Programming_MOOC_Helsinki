/*
============== Java Programming II ==============
Part 11
Section 3 - Exzceptions
Ex 12 - Sensors and temperature


Implement a program using interface, classes and Exception.
=================================================
*/

package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    
    private boolean on;
    
    public TemperatureSensor() {
        this.on = false;
    }
    
    @Override 
    public boolean isOn() {
        return this.on;
    }
    
    @Override 
    public void setOn() {
        this.on = true;
    }
    
    @Override 
    public void setOff() {
        this.on = false;
    }
    
    @Override
    public int read() {
        if (!this.on) {
            throw new IllegalStateException("Temperature sensor is off.");
        }
        
        Random rand = new Random();
        return rand.nextInt(61) - 30;
    }
    
    
}
