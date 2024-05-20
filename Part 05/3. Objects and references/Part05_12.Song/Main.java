/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 12 - Song


Implement the Song class.
=================================================
*/

public class Main {

    public static void main(String[] args) {

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
        
        Song song1 = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song song2 = new Song("The Lonely Island", "Jack Sparrow", 196);
        if(song1.equals(song2)) {
            System.out.println("Same!");
        }
        
        Song song11 = new Song("Ismo Leikola", "Pendolino", 194);
        Song song22 = new Song("Ismo Leikola", "Pendolino", 194);
        if(song11.equals(song22)) {
            System.out.println("Same!");
        }
    }
}
