/*
============== Java Programming I ==============
Part 6
Section 1 - Objetcs within objects
Ex 5 - Santa's Workshop


Implement the Gift and the Package classes.
=================================================
*/

public class Main {

    public static void main(String[] args) {


        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}
