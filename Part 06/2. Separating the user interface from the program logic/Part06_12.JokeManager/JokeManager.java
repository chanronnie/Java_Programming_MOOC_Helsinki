/*
============== Java Programming I ==============
Part 6
Section 2 - Separating the user interface from program logic
Ex 12 - Joke Manager 


Implement the JokeManager class.
=================================================
*/

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        Random rand = new Random();
        int randomIndex = rand.nextInt(this.jokes.size());
        return this.jokes.get(randomIndex);
    }
    
    public void printJokes() {
        for (String joke: jokes) {
            System.out.println(joke);
        }
    }
}
