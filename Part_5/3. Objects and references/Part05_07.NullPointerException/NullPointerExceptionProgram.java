/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 7 - NullPointerExceptionProgram


Implement a program that causes the NullPointerException error. 
The error should occur directly after starting the program — don't wait to read input from the user, for instance.
=================================================
*/

import java.util.ArrayList;

public class NullPointerExceptionProgram {

    public static void main(String[] args) {

        ArrayList<String> lines = new ArrayList<>();
        lines.add("Never has a man influenced physics so profoundly as Niels Bohr in the early 1900's");
        lines.add("Going back to this time period, little was known about atomic structure; Bohr set out");
        lines.add("to end the obscurity of physics. However, things didn't come easy for Bohr. He had to");
        lines.add("give up most of his life for physics and research of many hypothesis. But, this is why");
        lines.add("you and I have even heard of the quantum theory and atomic structures. Bohr came");
        lines.add("up with his quantum theory while studying...");

        int index = 0;
        while (index < lines.size()) {
            System.out.println(lines.get(index));
            index++;
        }

        // Adding this line will cause the NullPointerException error 
        lines = null;
        System.out.println(lines.size());
    }
}
