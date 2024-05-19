/*
============== Java Programming II ==============
Part 12
Section 1 - Type Parameters
Ex 1 - Hideout


Implement the class Hideout, which has a single generic type parameter.
=================================================
*/

public class Hideout<T> {
    
    private T hideout;
    
    public Hideout() {
    }
    
    public void putIntoHideout(T toHide) {
        this.hideout = toHide;
    }
    
    public T takeFromHideout(){
        T previousObject = this.hideout;
        this.hideout = null;
        return previousObject;
    }
    
    public boolean isInHideout() {
        return this.hideout != null;
    }
}
