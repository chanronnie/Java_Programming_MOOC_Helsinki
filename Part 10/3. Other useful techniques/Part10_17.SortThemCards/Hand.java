import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        this.cards.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(this.cards, (c1, c2) -> c1.compareTo(c2));
    }
    
    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
    
    public int sumOfValues() {
        return this.cards.stream().mapToInt(card -> card.getValue()).sum();
    }
    
    @Override
    public int compareTo(Hand other) {
        return this.sumOfValues() - other.sumOfValues();
    }
}
