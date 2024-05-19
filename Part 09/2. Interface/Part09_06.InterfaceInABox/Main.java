/*
============== Java Programming II ==============
Part 9
Section 2 - Interface
Ex 6 - Interface In A Box


Implement classes that utilizes interface concept.
=======
*/

public class Main {

    public static void main(String[] args) {
        
        // Fill in the first box with items
        Box box1 = new Box(10);
        box1.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box1.add(new Book("Robert Martin", "Clean Code", 1));
        box1.add(new Book("Kent Beck", "Test Driven Development", 0.7));
        box1.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box1.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box1.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        System.out.println("no 1: " + box1);
        
        // Fill in the second box with items
        Box box2 = new Box(50);
        for (int i = 0; i < 40; i++) {
            box2.add(new Book("Unknown Artist", "Book Title", 0.5));
        }
        System.out.println("no 2: " + box2);
        
        // Put the two boxes above in a bigger box
        Box bigBox = new Box(30);
        bigBox.add(box1);
        bigBox.add(box2);
        System.out.println("Big Box: " + bigBox);
    }

}
