
package application;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Dictionary {
    
    // Private fields
    private List<String> words;
    private Map<String, String> translations;
    
    // Constructor
    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap();
        
        add("hello", "salut");
    }
    
    public void add(String word, String translation) {
        if (!this.translations.containsKey(word)) {
            this.words.add(word);
        }
        this.translations.put(word, translation);
    }
    
    public String get(String word) {
        return this.translations.get(word);
    }
    
    public String getRandomWord() {
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));
    }
}
