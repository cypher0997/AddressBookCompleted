package addressBook;

public class ContactDetails {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNumber;

    ContactDetails() {
        //pass
    }
    ContactDetails(int set) {
        this.id = set;
    }

    ContactDetails(String firstName,String lastName,String address,String city,String state,
                    int zip,String phoneNumber,int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    
    @Override
    public String toString() {
        return "Contact : " + this.id + "-->" + "[firstName=" + firstName + ", lastName="
        + lastName + ", address=" + address + ", city=" + city + ", phoneNumber=" + phoneNumber + ", state=" + state + ", zip=" + zip + "]";
    }
    
    public String getFirstName() {
        return firstName;
    }
    public String getCity() {
        return city;
    }
    
    public String getState() {
        return state;
    }


}
