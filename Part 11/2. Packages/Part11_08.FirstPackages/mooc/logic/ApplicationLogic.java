/*
============== Java Programming II ==============
Part 11
Section 2 - Packages
Ex 9 - First packages


Implement the packages and their contents as directed by the instructions.
=================================================
*/

package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {
    
    private UserInterface ui;
    
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }
    
    public void execute(int times) {
        while (times > 0) {
            System.out.println("Application logic is working");
            this.ui.update();
            
            times--;
        }
    }
}
