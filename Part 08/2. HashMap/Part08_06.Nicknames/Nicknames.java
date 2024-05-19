/*
============== Java Programming I ==============
Part 8
Section 2 - Hashmap
Ex 6 - Nicknames


Implement a program that uses the Hashmap data structure.
=================================================
*/

import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        
        // Populate the HashMap with names and nicknames
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");
        
        // Retrieve and output the nickname for Matthew
        System.out.println("Matthew's nickname: " + nicknames.get("matthew"));
    }

}
