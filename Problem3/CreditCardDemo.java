package Problem3;

//Creating CreditCardDemo class and constants.
public class CreditCardDemo {
    public static void main(String[] args){
        final Money LIMIT = new Money (1000, 0);
        final Money FIRST_AMOUNT = new Money(200, 0);
        final Money SECOND_AMOUNT = new Money(10, 0);
        final Money THIRD_AMOUNT = new Money(25, 0);
        final Money FOURTH_AMOUNT = new Money(990, 0);
    
        //Creating a person(owner) and a credit card.
        Person owner = new Person("Jane", "Doe", new Address("123 Alphabet St", "St.John's", "NL", "A1A 2B2"));
        CreditCard visa = new CreditCard(owner, LIMIT);
    
        //Testing the credit card.
        System.out.println(visa.getPersonInfo());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Card Limit: " + visa.getCreditCardLimit());
        System.out.println();

        //Testing the credit card charge and payment.
        System.out.println("Attempt to charge: " + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to charge: " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to charge: " + THIRD_AMOUNT);
        visa.pay(THIRD_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to charge: " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
    }
}
  
