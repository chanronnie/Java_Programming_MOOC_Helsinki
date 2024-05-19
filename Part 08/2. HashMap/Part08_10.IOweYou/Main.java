/*
============== Java Programming I ==============
Part 8
Section 2 - Hashmap
Ex 10 - I owe you


Implement a program that uses the Hashmap data structure.
=================================================
*/

public class Main {

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
