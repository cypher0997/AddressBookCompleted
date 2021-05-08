package addressBook;

public class Contact {
   private int id;
   private String firstName;
   private String lastName;
   private String address;
   private String city;
   private String state;
   private int zip;
   private String phoneNumber;

    Contact() {
        //pass
    }
    Contact(int set) {
        this.id = set;
    }

   Contact(String firstName,String lastName,String address,String city,String state,
                    int zip,String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    
    @Override
   public String toString() {
        return "Contact : " + this.id + "[firstName=" + firstName + ", lastName="
        + lastName + ", address=" + address + ", city=" + city + ", phoneNumber=" + phoneNumber + ", state=" + state + ", zip=" + zip + "]";
    }

}
