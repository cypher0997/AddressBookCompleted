package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    int id = 0;
    int count = 0;
    int addressBookNumber = 0;

    public AddressBook(){
        // pass
    }

    AddressBook(int take){
        this.addressBookNumber = take;
    }

    List<ContactDetails> det = new ArrayList<>();

    ContactDetails settingContactPersons;
    
    public void setDetails() {
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Enter FirstName  : ");
        String firstName = takeInput.nextLine();
        for(int i =0;i<det.size();i++) {  
            if(firstName.equals(det.get(i).getFirstName())){ 
                System.out.println("name duplicacy detected, name already present,give another name");
                Scanner sc = new Scanner(System.in);
                String firstNameRechecked = sc.nextLine();
                firstName = firstNameRechecked;
            }
        }
        
        System.out.print("Enter LastName  : ");
        String lastName =takeInput.nextLine();
        
        System.out.print("Enter Address  : ");
        String address =takeInput.nextLine();
        
        System.out.print("Enter City  : ");
        String city =takeInput.nextLine();
        
        System.out.print("Enter State : ");
        String state =takeInput.nextLine();
        
        System.out.print("Enter PhoneNUmber : ");
        String phoneNumber =takeInput.nextLine();
        
        System.out.print("Enter Zip : ");
        String zip = takeInput.nextLine();
        int check = 0;
        try {
            check = Integer.parseInt(zip);
        } catch (NumberFormatException e) {
            System.out.println("Error! Invalid input");
        }
        System.out.print(" ");

        id++;
        settingContactPersons = new ContactDetails(firstName,lastName,address,city,state,check,phoneNumber,id);
    }

    /*this method is main execution sequence */
    public List<ContactDetails> ret() {
        int num = 0;
        System.out.println("enter the number of users u want to store");
        Scanner numberOfUsers = new Scanner(System.in);
        try {
            num = Integer.parseInt(numberOfUsers.nextLine());
            int numberOfUser = num;
            for(int i = 0;i<numberOfUser;i++) {
                System.out.println("enter th detail of user:"+i);
                setDetails();
                while(true) {
                    det.add(settingContactPersons);
                    break;
                }
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Error! Invalid value,execution will Stop here");
            ret();
        }
        return(det);
    }

    @Override
    public String toString() {
        return "AddressBook="+this.addressBookNumber+"[" + det + "]";
    }
    
}
