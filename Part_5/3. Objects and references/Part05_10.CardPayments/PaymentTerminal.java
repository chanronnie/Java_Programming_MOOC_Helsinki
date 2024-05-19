/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 10 - Payment Card


Implement the PaymentTerminal class.
=================================================
*/ 

public class PaymentTerminal {
    
    // Private fields
    private final double AFFORDABLE_PRICE = 2.50; // price of an affordable meal 
    private final double HEARTY_PRICE = 4.30;     // price of an hearty meal
    private double money;                         // amount of cash
    private int affordableMeals;                  // number of sold affordable meals
    private int heartyMeals;                      // number of sold hearty meals
   

    // Constructor
    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment < this.AFFORDABLE_PRICE) {
            return payment;
        }
        
        this.affordableMeals++;
        this.money += this.AFFORDABLE_PRICE;
        double change = payment - this.AFFORDABLE_PRICE;
        return change;       
    }

    public double eatHeartily(double payment) {
        if (payment < this.HEARTY_PRICE) {
            return payment;
        }
        this.heartyMeals++;
        this.money += this.HEARTY_PRICE;
        double change = payment - this.HEARTY_PRICE;
        return change;
    }

    public boolean eatAffordably(PaymentCard card) {
        boolean sucessfulPayment = card.takeMoney(this.AFFORDABLE_PRICE);
        if (sucessfulPayment) {
            this.affordableMeals++;
        }
        
        return sucessfulPayment;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        boolean sucessfulPayment = card.takeMoney(this.HEARTY_PRICE);
        if (sucessfulPayment) {
            this.heartyMeals++;
        }
        return sucessfulPayment;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
