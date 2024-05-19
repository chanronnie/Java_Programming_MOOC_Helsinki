/*
============== Java Programming II ==============
Part 12
Section 2 - ArrayList and hash table
Ex 4 - List


Implement the class List. The object List can store any type of elements.
It should have the methods add, remove, contains, indexValueOf, value and size.
=================================================
*/

public class Program {

    public static void main(String[] args) {
        
        List<String> myList = new List<>();
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
        int index = myList.indexOfValue("hello");
        System.out.println(index);
        System.out.println(myList.value(index));
        myList.remove("hello");
        System.out.println(myList.contains("hello"));

        List<String> myList1 = new List<>();
        myList1.add("hello");
        myList1.add("world");
        for(int i = 0; i < myList1.size(); i++) {
            System.out.println(myList1.value(i));
        }

    }

}
