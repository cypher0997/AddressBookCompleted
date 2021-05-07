package addressBook;

public class AddContact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNumber;
    private String email;

    public AddContact(String firstName,String lastName,String address,String city,String state,String email,
                    int zip,String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
   
   
    public void display(){
        System.out.println("FirstName: "+this.firstName);
        System.out.println("LastName: "+this.lastName);
        System.out.println("Address: "+this.address);
        System.out.println("City: "+this.city);
        System.out.println("State: "+this.state);
        System.out.println("Zip: "+this.zip);
        System.out.println("PhoneNumber: "+this.phoneNumber);
        System.out.println("Email: "+this.email);
      
    }
}
