/*
============== Java Programming I ==============
Part 6
Section 1 - Objetcs within objects
Ex 2 - Stack


Implement the Stack class and a program as directed by the instructions.
=================================================
*/

public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();
        System.out.println(s.isEmpty()); // True
        System.out.println(s.values());  // []
        s.add("Value");
        System.out.println(s.isEmpty()); // False
        System.out.println(s.values());  // [Value]
        String taken = s.take();         
        System.out.println(s.isEmpty()); // True
        System.out.println(s.values());  // []
        System.out.println(taken);       // Value

        Stack a = new Stack();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");

        while (!a.isEmpty()) {
            System.out.println(a.take());
        }
    }
}
