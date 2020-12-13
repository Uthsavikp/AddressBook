public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
    }
}
class Person{
    // variables
    public String firstName, lastName, address, city, state;
    public int zip, phoneNumber;

    //constructor
    public Person(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }
}
