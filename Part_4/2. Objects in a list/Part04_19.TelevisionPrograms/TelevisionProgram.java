/*
============== Java Programming I ==============
Part 4
Section 2 - Objects in a list
Ex 19 - Television Program


The TelevisionProgram class has already been implemented.
=================================================
*/

public class TelevisionProgram {

    private String name;
    private int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public boolean isAwesome() {
        return this.name.contains("MasterChef");
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }
}
