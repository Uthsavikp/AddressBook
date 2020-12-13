import java.util.Scanner;// Import the Scanner class
import java.util.ArrayList;

class Person {

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

    public Person() {

    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
}
    public class AddressBookMain {
        static ArrayList<Person> addressBook = new ArrayList<Person>();

        public static void main(String[] args) {
            System.out.println("Welcome to Address Book Program");
            AddressBookMain addressBook = new AddressBookMain();
            addressBook.addPerson();
        }

        public void addPerson() {
            // Using Scanner to input data from user
            Scanner myObject = new Scanner(System.in); // Create a Scanner object
            System.out.println("Enter first name");
            String firstName = myObject.next(); // Reading user input
            System.out.println("First name is: " + firstName); // Output user input
            System.out.println("Enter last name");
            String lastName = myObject.next();
            System.out.println("Last name is: " + lastName);
            System.out.println("Enter address");
            String address = myObject.next();
            System.out.println("Address is: " + address);
            System.out.println("Enter city");
            String city = myObject.next();
            System.out.println("City is: " + city);
            System.out.println("Enter state");
            String state = myObject.next();
            System.out.println("State name is: " + state);
            System.out.println("Enter zip");
            int zip = myObject.nextInt();
            System.out.println("Zip code is: " + zip);
            System.out.println("Enter phone number");
            int phoneNumber = myObject.nextInt();
            System.out.println("Phone number is: " + phoneNumber);
            Person person = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
            addressBook.add(person);
            System.out.println(person);
        }


        public void editPerson() {
            try (Scanner myObject = new Scanner(System.in)) {
                System.out.println("Enter the name of a person you want to edit");
                String enteredName = myObject.next();
                ArrayList<String> book = new ArrayList<String>();
                for (Person person1 : addressBook) {
                    if (person1.getFirstName().equalsIgnoreCase(enteredName)) {
                        System.out.println("Enter address");
                        book.add(myObject.next());
                        System.out.println("Enter city");
                        book.add(myObject.next());
                        System.out.println("Enter state");
                        book.add(myObject.next());
                        System.out.println("Enter zip");
                        book.add(myObject.next());
                        System.out.println("Enter phone Number");
                        book.add(myObject.next());
                    } else {
                        System.out.println("The Person does not exist");
                    }
                }
            }
        }
    }




