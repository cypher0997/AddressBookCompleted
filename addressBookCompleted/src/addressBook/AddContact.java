package addressBook;

import java.util.Scanner;

public class AddContact {
    private String FirstName;
    private String LastName;
    private String Address;
    private String City;
    private String State;
    private int Zip;
    private String PhoneNumber;

    public AddContact() {
        //pass
    }
    public AddContact(String firstName,String lastName,String address,String city,String state,
                    int zip,String phoneNumber) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Address = address;
        this.City = city;
        this.State = state;
        this.Zip = zip;
        this.PhoneNumber = phoneNumber;
    }

    public void display(int take) {

        System.out.println("the contact person number:"+ take);
        System.out.println("FirstName: "+this.FirstName);
        System.out.println("LastName: "+this.LastName);
        System.out.println("Address: "+this.Address);
        System.out.println("City: "+this.City);
        System.out.println("State: "+this.State);
        System.out.println("Zip: "+this.Zip);
        System.out.println("PhoneNumber: "+this.PhoneNumber);
    }
}
