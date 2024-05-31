/*
============== Java Programming II ==============
Part 14
Section 3 - Larger application: Asteroids
Ex 9 - Asteroids


Implement the Asteroids game by following the step-by-step examples. 
Make any additional changes if needed.
=================================================
*/

package characters;

import javafx.scene.shape.Polygon;

public class Ship extends Character {
    
    public Ship(int x, int y) {
        super(new Polygon(-5, -5, 10, 0, -5, 5), x, y);
    }
}
