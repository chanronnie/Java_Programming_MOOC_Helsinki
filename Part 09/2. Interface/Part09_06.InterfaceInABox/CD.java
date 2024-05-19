/*
============== Java Programming II ==============
Part 9
Section 2 - Interface
Ex 6 - Interface In A Box


Implement classes that utilizes interface concept.
=======
*/

public class CD implements Packable {
    
    // Private fields
    private String artist;
    private String song;
    private int publicationYear;
    
    // Constructor
    public CD(String artist, String song, int publicationYear) {
        this.artist = artist;
        this.song = song;
        this.publicationYear = publicationYear;
    }
    
    @Override
    public double weight() {
        return 0.1;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.song + " (" + this.publicationYear + ")";
    }
}
