/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 13 - Identical twins


Complete the program as directed by the instructions.
=================================================
*/

public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        } else {
            System.out.println("Not equal");
        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        } else {
            System.out.println("Not equal");
        }
    }
}
