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

import asteroids.AsteroidsApplication;
import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public abstract class Character {
    
    // Private fields
    private Polygon character;
    private Point2D movement;
    private boolean alive;
    
    // Constructor
    public Character(Polygon polygon, int x0, int y0) {
        this.character = polygon;
        
        // Set the initial position of the polygon at the starting game
        this.character.setTranslateX(x0);
        this.character.setTranslateY(y0);
        
        this.movement = new Point2D(0, 0);
        
        this.alive = true;
    }
    
    public Polygon getCharacter() {
        return this.character;
    }
    
    public Point2D getMovement() {
        return this.movement;
    }
    
    public void setMovement(Point2D newMovement) {
        this.movement = newMovement;
    }
    
    public void turnLeft() {
        this.character.setRotate(this.character.getRotate() - 5);
    }
    
    public void turnRight() {
        this.character.setRotate(this.character.getRotate() + 5);
    }
    
    public void move() {
        this.character.setTranslateX(this.character.getTranslateX() + this.movement.getX());
        this.character.setTranslateY(this.character.getTranslateY() + this.movement.getY());
        
        double screenWidth = AsteroidsApplication.WIDTH;
        double screenHeight = AsteroidsApplication.HEIGHT;
        
        // Adjust the character movement to stay within the window
        if (this.character.getTranslateX() < 0) {
            this.character.setTranslateX(this.character.getTranslateX() + screenWidth);
        }
        
        if (this.character.getTranslateX() > 0) {
            this.character.setTranslateX(this.character.getTranslateX() % screenWidth);
        }
        
        if (this.character.getTranslateY() < 0) {
            this.character.setTranslateY(this.character.getTranslateY() - screenHeight);
        }
        
        if (this.character.getTranslateY() > 0) {
            this.character.setTranslateY(this.character.getTranslateY() % screenHeight);
        } 
    }
    
    public void accelerate() {
        double changeX = Math.cos(Math.toRadians(this.character.getRotate())) * 0.05;
        double changeY = Math.sin(Math.toRadians(this.character.getRotate())) * 0.05;
        
        this.movement = this.movement.add(changeX, changeY);
    }
    
    public boolean collide(Character other) {
        Shape collisionArea = Shape.intersect(this.character, other.getCharacter());
        return collisionArea.getBoundsInLocal().getWidth() != -1;
    }
    
    public boolean isAlive() {
        return this.alive;
    }
    
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
