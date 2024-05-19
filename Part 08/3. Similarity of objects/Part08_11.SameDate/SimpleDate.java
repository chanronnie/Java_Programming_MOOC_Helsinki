/*
============== Java Programming II ==============
Part 8
Section 3 - Similarity of objects
Ex 11 - Same date


Override the equals method of the SimpleDate class.
=================================================
*/

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }
    
    public boolean equals(Object compared) {
        
        if (this == compared) {
            return true;
        }
        
        if (compared == null || !(compared instanceof SimpleDate)) {
            return false;
        }
        
        SimpleDate other = (SimpleDate) compared;
        return (this.year == other.year &&
                this.month == other.month &&
                this.day == other.day);
    }

}
