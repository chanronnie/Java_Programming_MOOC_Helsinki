/*
============== Java Programming II ==============
Part 11
Section 2 - Packages
Ex 9 - First packages


Implement the packages and their contents as directed by the instructions.
=================================================
*/

package mooc.ui;

public class TextInterface implements UserInterface {
    
    @Override
    public void update() {
        System.out.println("Updating UI");
    }
}
