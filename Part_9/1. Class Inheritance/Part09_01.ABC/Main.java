/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 1 - ABC


Implement classes that utilize class inheritance concepts.
=================================================
*/

public class Main {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();
        
        // Class inheritance concepts
        C cc = new C();
        cc.a();
        cc.b();
        cc.c();
        
    }
}
