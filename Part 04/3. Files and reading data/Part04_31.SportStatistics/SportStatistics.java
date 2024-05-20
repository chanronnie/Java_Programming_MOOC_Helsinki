/*
============== Java Programming I ==============
Part 4
Section 3 - Files and reading data
Ex 31 - Sport Statistics


Implement a program that reads sport statistics from a file. 
It prompts the user for a team and outputs its statistics.
=================================================
*/

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    // Main program
    public static void main(String[] args) {
        
        // Prompt the user for a file and a team to search for
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String searchedTeam = scan.nextLine();
        
        // Read the contents of the file
        ArrayList<Match> matches = readMatchesFromFile(file);
        int games = 0;
        int wins = 0;
        int losses = 0;
        for (Match match: matches) {
                
            if (match.getHomeTeam().equals(searchedTeam) || match.getVisitingTeam().equals(searchedTeam)) {
                games++;
                    
                if (match.getWinnerTeam().equals(searchedTeam)) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }
        // Output the statistics
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    
    // Method 
    public static ArrayList<Match> readMatchesFromFile(String fileName) {
        ArrayList<Match> matches = new ArrayList<>();
        
        try (Scanner readerFile = new Scanner(Paths.get(fileName))) {
        
            while (readerFile.hasNextLine()) {
                String line = readerFile.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                matches.add(new Match(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }
        
        return matches;
    }
}
