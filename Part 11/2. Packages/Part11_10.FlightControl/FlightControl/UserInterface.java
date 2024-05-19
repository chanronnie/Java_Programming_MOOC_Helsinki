/*
============== Java Programming II ==============
Part 11
Section 2 - Packages
Ex 10 - Flight Control


Implement the packages and their contents as directed by the instructions.
=================================================
*/


package FlightControl;

import java.util.Scanner;
import FlightControl.domain.Airplane;

public class UserInterface {
    
    // Private fields
    private Scanner scan;
    private FlightControl flightControl;
    
    // Constructor
    public UserInterface(Scanner scan) {
        this.scan = new Scanner(System.in);
        this.flightControl = new FlightControl();
    }
    
    // Method that executes the program
    public void start() {
        proceedAssetControl();
        proceedFlightControl();
    }
    
    public void proceedAssetControl() {
        while (true) {
            // Print airport asset control menu
            System.out.println("Airport Asset Control"); 
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            
            // Execute the given input 
            String command = scan.nextLine();
            if (command.equals("1")) {
                addAirplane();
            } else if (command.equals("2")) {
                addFlight();
            }  else if (command.equals("x")) {
                break;
            }
            
            System.out.println();
        }
    }
    
    public void addAirplane() {
        System.out.print("Give the airplane id:");
        String airplaneID = scan.nextLine();
        System.out.print("Give the airplane capacity:");
        int capacity = scan.nextInt();
        
        this.flightControl.addAirplane(airplaneID, capacity);
    }
    
    public void addFlight() {
        System.out.println("Give the airplane id:");
        Airplane airplane = findAirplane();
        System.out.println("Give the departure airport id:");
        String departureAirport = scan.nextLine();
        System.out.println("Give the target airport id: ");
        String targetAirport = scan.nextLine();
        
        this.flightControl.addFlight(airplane, departureAirport, targetAirport);
    }

    public void proceedFlightControl() {
        while (true) {
            // Print the flight control menu
            System.out.println("");
            System.out.println("Flight Control");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            
            
            // Execute the given input
            String command = scan.nextLine();
            if (command.equals("1")) {
                // Print airplanes
                this.flightControl.getAirplanes().forEach(airplane -> System.out.println(airplane));
                
            } else if (command.equals("2")) {
                // Print flights
                this.flightControl.getFlights().forEach(flight -> System.out.println(flight));
                
            } else if (command.equals("3")) {
                // Print airplane details
                System.out.println("Give the airplane id:");
                Airplane airplane = findAirplane();
                System.out.println(airplane);
                
            } else if (command.equals("x")) {
                break;
            }
        }
    }
    
    public Airplane findAirplane() {
        Airplane airplane = null;
        
        // Continue prompting the user until they provide an existing airplane ID
        while (airplane == null) {
            String airplaneID = this.scan.nextLine();
            airplane = this.flightControl.getAirplane(airplaneID);
            
            if (airplane == null) {
                System.out.println("Cannot find the airplane ID: " + airplaneID);
            }
        }
        return airplane;
    }
}
