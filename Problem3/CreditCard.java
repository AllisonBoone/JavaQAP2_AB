package Problem3;

//Creating CreditCard class.
public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditCardLimit;

    //Creating the constructor.
    public CreditCard(Person owner, Money creditCardLimit){
        this.owner = owner;
        this.creditCardLimit = new Money(creditCardLimit);
        this.balance = new Money(0, 0);
    }

    //Access the credit cards balance.
    public Money getBalance(){
        return new Money(balance);
    }

    //Access credit cards limit.
    public Money getCreditCardLimit(){
        return new Money(creditCardLimit);
    }

    //Access the owners information.
    public String getPersonInfo(){
        return owner.toString();
    }

    //Making a charge on the credit card.
    public void charge(Money amount){
        Money newBalance = new Money(balance);
        newBalance.add(amount);
        if(newBalance.compareTo(creditCardLimit) <= 0){
            balance.add(amount);
            System.out.println("Charge: " + amount);
        }else{
            System.out.println("Charge exceeds credit card limit.");
        }
    }

    //Making a payment.
    public void pay(Money amount){
        balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
