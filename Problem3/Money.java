package Problem3;

//Creating the Money class.
public class Money {
    private int dollars;
    private int cents;

    //Creating the constructor.
    public Money(int dollars, int cents){
        this.dollars = dollars;
        this.cents = cents;
    }

    //Creating the copy constructor.
    public Money(Money other){
        this.dollars = other.dollars; 
        this.cents = other.cents;
    }

    //Adding money.
    public void add(Money amount){
        this.cents += amount.cents;
        this.dollars += amount.dollars + (this.cents / 100);
        this.cents = this.cents % 100;
    }

    //Subtracting money.
    public void subtract(Money amount){
        int totalCents1 = this.dollars * 100 + this.cents;
        int totalCents2 = amount.dollars * 100 + amount.cents;
        int difference = totalCents1 - totalCents2;
        this.dollars = difference / 100;
        this.cents = difference % 100;
    }

    //Creating a compareTo method.
    public int compareTo(Money other){
        int thisTotalCents = this.dollars * 100 + this.cents;
        int otherTotalCents = other.dollars * 100 + other.cents;
        return thisTotalCents - otherTotalCents;
    }

    //Creating the equals method.
    public boolean equals(Money other){
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    //Creating the toString method.
    public String toString(){
        return "$" + this.dollars + "." + String.format("%02d", this.cents);
    }
}
