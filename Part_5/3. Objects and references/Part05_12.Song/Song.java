/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 12 - Song


Implement the Song class
=================================================
*/

public class Song {

    // Private fields
    private String artist;
    private String name;
    private int durationInSeconds;

    // Constructor
    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compared) {
        
        // Compare the location or instance of the object
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Song)) {
            return false;
        }
        
        // Compare each variable of both objects
        Song comparedSong = (Song) compared;
        if (this.artist.equals(comparedSong.artist) &&
            this.name.equals(comparedSong.name) &&
            this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }

        // Otherwise, the objects are not equal
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
