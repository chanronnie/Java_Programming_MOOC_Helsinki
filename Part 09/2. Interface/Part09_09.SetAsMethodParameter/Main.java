/*
============== Java Programming II ==============
Part 9
Section 2 - Interface
Ex 9 - Set as a method parameter


Implement classes that utilizes interface concept.
=======
*/

import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));

    }

    // Class method
    public static int returnSize(Set set) {
        return set.size();
    }

}
