/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 10 - Song


Create a class Song.
=================================================
*/

public class Song {
    
    // Private fields
    private String name;
    private int length;
    
    // Constructor
    public Song(String songName, int songLength) {
        this.name = songName;
        this.length = songLength;
    }
    
    // Methods
    public String name() {
        return this.name;
    }
            
    public int length() {
        return this.length;
    }
}
