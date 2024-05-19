/*
============== Java Programming I ==============
Part 8
Section 2 - Hashmap
Ex 7 - Abbreviations


Implement a program that uses the Hashmap data structure.
=================================================
*/

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        String cleaned_abbreviation = standardizeText(abbreviation);
        String cleaned_explanation = standardizeText(explanation);
        this.abbreviations.put(cleaned_abbreviation, cleaned_explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        String cleaned_abbreviation = standardizeText(abbreviation);
        return this.abbreviations.containsKey(cleaned_abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        String cleaned_abbreviation = standardizeText(abbreviation);
        return this.abbreviations.get(cleaned_abbreviation);
    }
    
    // Helper method
    public String standardizeText(String givenString) {
        if (givenString == null) {
            return "";
        }
        
        return givenString.toLowerCase().trim();  
    }
}
