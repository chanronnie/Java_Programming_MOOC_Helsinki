/*
============== Java Programming I ==============
Part 7
Section 3 - Larger programming exercises
Ex 8 - Big year


Implement an interactive program that stores birds for bird-watchers.
=================================================
*/

import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }
    
    public boolean contains(String birdName) {
        for (Bird bird: this.birds) {
            if (bird.getName().equals(birdName)) {
                return true;
            }
        }
        return false;
    }
    
    public Bird getBird(String birdName) {
        for (Bird bird: this.birds) {
            if (bird.getName().equals(birdName)) {
                return bird;
            }
        }
        
        return null;
    }
    
    public void printAll() {
        for (Bird bird: this.birds) {
            System.out.println(bird);
        }
    }
}
