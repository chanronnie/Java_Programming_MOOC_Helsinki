/*
============== Java Programming I ==============
Part 4
Section 3 - Files and reading data
Ex 31 - Sport Statistics


Implement a class for the SportStatistics program.
=================================================
*/

public class Match {
    
    // Private fields
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;
    
    // Constructor
    public Match(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }
    
    // "Getter" methods
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getVisitingTeam() {
        return this.visitingTeam;
    }
    
    public int getHomeTeamPoints() {
        return this.homeTeamPoints;
    }
    
    public int getVisitingTeamPoints() {
        return this.visitingTeamPoints;
    }
    
    // Other methods
    public String getWinnerTeam() {
        if (this.homeTeamPoints > this.visitingTeamPoints) {
            return this.homeTeam;
        } else {
            return this.visitingTeam;
        }
    }
    
    public String getLoserTeam() {
        if (this.homeTeamPoints < this.visitingTeamPoints) {
            return this.homeTeam;
        } else {
            return this.visitingTeam;
        }
    }
}
