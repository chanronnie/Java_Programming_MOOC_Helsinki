/*
============== Java Programming II ==============
Part 8
Section 4 - Grouping data using hash maps
Ex 14 - Dictionary of many translations


Implement a program for storing words along with their translations using a HashMap.
=================================================
*/

import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations() {
        dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        this.dictionary.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        return this.dictionary.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word) {
        this.dictionary.remove(word);
    }
    
}
