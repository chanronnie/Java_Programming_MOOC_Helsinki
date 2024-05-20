/*
============== Java Programming I ==============
Part 6
Section 2 - Separating the user interface from program logic
Ex 9 - Simple Dictionary


Implement the SimpleDictionary class has already been implemented.
=================================================
*/

import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}
