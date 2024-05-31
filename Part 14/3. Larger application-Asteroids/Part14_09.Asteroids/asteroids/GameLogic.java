/*
============== Java Programming II ==============
Part 14
Section 3 - Larger application: Asteroids
Ex 9 - Asteroids


Implement the Asteroids game by following the step-by-step examples. 
Make any additional changes if needed.
=================================================
*/

package asteroids;

import static asteroids.AsteroidsApplication.WIDTH;
import static asteroids.AsteroidsApplication.HEIGHT;
import characters.Asteroid;
import characters.Projectile;
import characters.Ship;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicInteger;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class GameLogic {
    
    // Private fields
    private Pane pane;
    private Scene scene;
    private Text pointsText;
    private AtomicInteger pointsCounter;
    private Map<KeyCode, Boolean> pressedKeys;
    private Ship ship;
    private List<Asteroid> asteroids;
    private List<Projectile> projectiles;
    
    // Constructor
    public GameLogic(Pane pane, Scene scene) {
        this.pane = pane;
        this.scene = scene;
        this.pointsText = new Text(10, 20, "Points: 0");
        this.pointsCounter = new AtomicInteger();
        this.pressedKeys = new HashMap<>();
        
        this.ship = new Ship(WIDTH/2, HEIGHT/2);
        this.projectiles = new ArrayList<>();
        this.asteroids = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            Asteroid asteroid = new Asteroid(rand.nextInt(WIDTH/3), rand.nextInt(HEIGHT));
            this.asteroids.add(asteroid);
        }
    }
    
    public void runGame() throws Exception{
        
        // Place the characters in the pane
        this.pane.getChildren().add(pointsText);
        this.pane.getChildren().add(this.ship.getCharacter());
        this.asteroids.forEach(asteroid -> this.pane.getChildren().add(asteroid.getCharacter()));
        
        // Handle keyboard events
        this.scene.setOnKeyPressed(event -> {this.pressedKeys.put(event.getCode(), Boolean.TRUE);});
        this.scene.setOnKeyReleased(event -> {this.pressedKeys.put(event.getCode(), Boolean.FALSE);});
        
        new AnimationTimer() {
        
            @Override
            public void handle(long now) {
                
                processKeyInput();
                moveTheElements();
                checkCollisions(); 
                removeCollidedElements();
                addNewAsteroid();
                
                // End game if the ship hits an asteroid
                asteroids.stream().forEach(asteroid -> {
                    if (ship.collide(asteroid)) {
                        pointsText.setText("Game Over!");
                        stop();
                    }
                });
            } 
        }.start(); 
    }// end of method
    
    private void processKeyInput() {
        // Handle key press actions for the "ship"
        if (this.pressedKeys.getOrDefault(KeyCode.LEFT, false)) {
            this.ship.turnLeft();
        }
                
        if (this.pressedKeys.getOrDefault(KeyCode.RIGHT, false)) {
            this.ship.turnRight();
        }
                
        if (this.pressedKeys.getOrDefault(KeyCode.UP, false)) {
            this.ship.accelerate();
        }
               
        // Handle key press action for the "projectiles"
        if (this.pressedKeys.getOrDefault(KeyCode.SPACE, false) && this.projectiles.size() < 50) {
            Projectile projectile = new Projectile((int) this.ship.getCharacter().getTranslateX(), (int) this.ship.getCharacter().getTranslateY());
            projectile.getCharacter().setRotate(ship.getCharacter().getRotate());
            this.projectiles.add(projectile);
                    
            projectile.accelerate();
            projectile.setMovement(projectile.getMovement().normalize().multiply(3));
                     
            this.pane.getChildren().add(projectile.getCharacter());
        }
    }
    
    private void moveTheElements() {
        this.ship.move();
        this.asteroids.forEach(asteroid -> asteroid.move());
        this.projectiles.forEach(projectile -> projectile.move());
    }
    
    private void checkCollisions() {
        this.projectiles.forEach(projectile -> {
            // Check if the projectile hits an asteroid
            this.asteroids.forEach(asteroid -> {
                if (projectile.collide(asteroid)) {
                    projectile.setAlive(false);
                    asteroid.setAlive(false);
                    
                    // Update points system
                    this.pointsText.setText("Points: " + this.pointsCounter.addAndGet(1000));   
                }
            });
        });
    }
    
    private void removeCollidedElements() {
        // Remove collided projectiles 
        this.projectiles.stream()
                    .filter(projectile -> !projectile.isAlive())
                    .forEach(projectile -> {pane.getChildren().remove(projectile.getCharacter());});
                
        this.projectiles.removeAll(this.projectiles.stream()
                                                .filter(projectile -> !projectile.isAlive())
                                                .collect(Collectors.toList()));
           
        // Remove collided asteroids
        this.asteroids.stream()
                    .filter(asteroid -> !asteroid.isAlive())
                    .forEach(asteroid -> {pane.getChildren().remove(asteroid.getCharacter());});
                
        this.asteroids.removeAll(this.asteroids.stream()
                                                .filter(asteroid -> !asteroid.isAlive())
                                                .collect(Collectors.toList()));
    }
    
    private void addNewAsteroid() {
        if(Math.random() < 0.005) {
            Asteroid asteroid = new Asteroid(WIDTH, HEIGHT);
            if(!asteroid.collide(this.ship)) {
                this.asteroids.add(asteroid);
                this.pane.getChildren().add(asteroid.getCharacter());
            }
        }
    }
}
