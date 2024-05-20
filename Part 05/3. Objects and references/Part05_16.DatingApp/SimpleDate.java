/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 16 - Dating Appp


Implement the SimpleDate class.
=================================================
*/

public class SimpleDate {

    // Private fields
    private final int DAYS_IN_A_MONTH = 30;
    private final int MONTHS_IN_A_YEAR = 12;
    private int day;
    private int month;
    private int year;

    // Constructor
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        this.day = this.day + 1;
        if (this.day > DAYS_IN_A_MONTH) {
            this.month = this.month + (this.day / DAYS_IN_A_MONTH);
            this.day = this.day % DAYS_IN_A_MONTH;
            
            if (this.month > MONTHS_IN_A_YEAR) {
                this.year = this.year + (this.month/ MONTHS_IN_A_YEAR);
                this.month = this.month % MONTHS_IN_A_YEAR;    
            }
        }
    }
    
    public void advance(int howManyDays) {
        if (howManyDays < 0) {
            return;
        }
        
        this.day = this.day + howManyDays - 1;
        this.advance();
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
}
