/*
============== Java Programming II ==============
Part 8
Section 3 - Similarity of objects
Ex 11 - Same date


Override the equals method of the SimpleDate class.
=================================================
*/

public class Main {

    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}
