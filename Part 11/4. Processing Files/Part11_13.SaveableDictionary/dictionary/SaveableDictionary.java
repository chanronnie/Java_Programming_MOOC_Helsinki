
package dictionary;

import java.io.PrintWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class SaveableDictionary {
    
    // Private fields
    private HashMap<String, String> dictionary;
    private String file;
    
    // Constructor
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    // Constructor with parameter
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);
        this.dictionary.putIfAbsent(translation, word);
    }
    
    public String translate(String word) {
        return this.dictionary.getOrDefault(word, null);
    }
    
    public void delete(String word) {
        if (this.dictionary.isEmpty() || !this.dictionary.containsKey(word)) {
            throw new IllegalStateException();
        }
        
        String translation = this.dictionary.get(word);
        this.dictionary.remove(word);
        this.dictionary.remove(translation);
    }
    
    public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
                .map(line -> line.split(":"))
                .forEach(parts -> this.add(parts[0], parts[1]));
            return true;
            
        } catch (IOException e) {
            return false;
        }
    }
    
    public boolean save() {
        try {
            PrintWriter pw = new PrintWriter(this.file);
            pw.print(ContentToWriteToFile());
            pw.close();
            return true;
            
        } catch (IOException e) {
            return false;
        }  
    }
    
    public String ContentToWriteToFile() {  
        String content = "";
        for (String word: this.dictionary.keySet()) {
            if (content.contains(word) || content.contains(this.dictionary.get(word))) {
                continue;
            }
            String translation = this.dictionary.get(word);
            content += word + ":" + translation + "\n";       
        }
        return content;
    } 
}
