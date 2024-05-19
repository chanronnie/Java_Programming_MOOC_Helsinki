/*
============== Java Programming II ==============
Part 8
Section 4 - Grouping data using hash maps
Ex 14 - Dictionary of many translations


Implement a program for storing words along with their translations using a HashMap.
=================================================
*/

public class Program {

    public static void main(String[] args) {

        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");
        
        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }
}
