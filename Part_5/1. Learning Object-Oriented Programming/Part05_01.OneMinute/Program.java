/*
============== Java Programming I ==============
Part 5
Section 1 - Learning object-oriented programming
Ex 1 - One Minute


Implement a class called Timer that uses the ClockHand class.
=================================================
*/

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
