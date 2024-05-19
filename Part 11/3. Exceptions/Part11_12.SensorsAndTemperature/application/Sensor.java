/*
============== Java Programming II ==============
Part 11
Section 3 - Exzceptions
Ex 12 - Sensors and temperature


Implement a program using interface, classes and Exception.
=================================================
*/
package application;

public interface Sensor {

    boolean isOn();    // returns true if the sensor is on
    void setOn();      // sets the sensor on
    void setOff();     // sets the sensor off
    int read();        // returns the value of the sensor if it's on
                       // if the sensor is not on throw a IllegalStateException
}
