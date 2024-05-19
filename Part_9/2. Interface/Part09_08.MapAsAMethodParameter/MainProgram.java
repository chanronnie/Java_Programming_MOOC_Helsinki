/*
============== Java Programming II ==============
Part 9
Section 2 - Interface
Ex 8 - Map as a method parameter


Implement classes that utilizes interface concept.
=======
*/

import java.util.Map;
import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));

    }
    
    // Class method
    public static int returnSize(Map map) {
        return map.size();
    }
}
