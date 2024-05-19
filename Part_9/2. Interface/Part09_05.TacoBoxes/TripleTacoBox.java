/*
============== Java Programming II ==============
Part 9
Section 2 - Interface
Ex 5 - Taco Boxes 


Implement classes that implements the TacoBox interface.
=======
*/

public class TripleTacoBox implements TacoBox{
    private int tacos;
    
    public TripleTacoBox() {
        this.tacos = 3;
    }
    
    public void setTacos(int tacos) {
        this.tacos = tacos;
    }
    
    public int tacosRemaining() {
        return this.tacos;
    }
    
    public void eat() {
        if (this.tacos <= 0) {
            return;
        }
        this.tacos--;
    }
}
