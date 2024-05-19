/*
============== Java Programming II ==============
Part 9
Section 2 - Interface
Ex 7 - List as a method parameter


Implement classes that utilizes interface concept.
=======
*/

import java.util.List;
import java.util.ArrayList;

public class mainProgram {

    // Main program
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));

    }

    // Class method
    public static int returnSize(List givenList) {
        return givenList.size();
    }
}
