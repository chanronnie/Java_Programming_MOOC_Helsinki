/*
============== Java Programming I ==============
Part 4
Section 2 - Objects in a list
Ex 19 - Television Program


Implement a program that uses the TelevisionProgram class, as directed by the instructions.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Read information from the user
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, duration));   
        }
        
        // Output the program informations within the given maximum duration
        System.out.println("");
        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram program: programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }
    }
}
