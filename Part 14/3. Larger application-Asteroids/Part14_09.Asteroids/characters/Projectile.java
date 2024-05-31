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

public class Projectile extends Character {
    public Projectile(int x, int y) {
        super(new Polygon(2, -2, 2, 2, -2, 2, -2, -2), x, y);
    }
}
