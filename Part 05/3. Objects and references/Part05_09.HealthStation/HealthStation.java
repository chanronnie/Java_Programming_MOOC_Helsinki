/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 9 - Health Station


Implement the HealthStation class.
=================================================
*/

public class HealthStation {

    private int countWeighings;
    
    public HealthStation() {
        this.countWeighings = 0;
    }

    public int weigh(Person person) {
        this.countWeighings++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return this.countWeighings;
    }
}
