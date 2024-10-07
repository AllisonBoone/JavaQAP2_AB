package Problem3;

//Creating Person class.
public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    //Creating constructor.
    public Person(String firstName, String lastName, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    //Creating the toString method.
    public String toString(){
        return lastName + " " + firstName + ", " + address;
    }
}
