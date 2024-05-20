/*
============== Java Programming I ==============
Part 5
Section 1 - Learning object-oriented programming
Ex 3 - Cube


Implement a class called "Cube".
=================================================
*/

public class Cube {
    private int edgeLength;
    
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    public int volume() {
        return this.edgeLength * this.edgeLength * this.edgeLength;
    }
    
    @Override
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }
}
