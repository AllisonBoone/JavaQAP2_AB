package Problem3;

//Creating Address class.
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    //Creating the constructor.
    public Address(String street, String city, String state, String zipCode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    //Creating toString method.
    public String toString(){
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}
