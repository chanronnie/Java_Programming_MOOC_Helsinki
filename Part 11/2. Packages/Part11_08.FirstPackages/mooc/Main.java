/*
============== Java Programming II ==============
Part 11
Section 2 - Packages
Ex 9 - First packages


Implement the packages and their contents as directed by the instructions.
=================================================
*/

package mooc;

import mooc.ui.*;
import mooc.logic.ApplicationLogic;

public class Main {

    public static void main(String[] args) {
        
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
