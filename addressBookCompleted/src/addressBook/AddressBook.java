package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    int id = 0;
    int count = 0;
    int addressBookNumber = 0;

    AddressBook(){
        // pass
    }

    AddressBook(int take){
        this.addressBookNumber = take;
    }

    /*following method is used to enter the ,number of user to be stored*/
    public int numberOfUser() {
        int num = 0;
        System.out.println("enter the number of users u want to store");
        Scanner numberOfUsers = new Scanner(System.in);
        try {
            num = Integer.parseInt(numberOfUsers.nextLine());
        }
        catch (NumberFormatException e) {
            System.out.println("Error! Invalid integer. Try again.");
            
            if(count<3){
                count++;
                numberOfUser();
            }
        }
        return num;        
    }

    List<ContactDetails> det = new ArrayList<>();

    ContactDetails settingContactPersons;
    
    public void setDetails() {
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Enter FirstName  : ");
        String firstName = takeInput.nextLine();
        
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
        int numberOfUser = numberOfUser();
        for(int i = 0;i<numberOfUser;i++) {
            System.out.println("enter th detail of user:"+i);
            setDetails();
            while(true) {
                det.add(settingContactPersons);
                break;
            }
        }
        return(det);
    }

    public List<AddressBook> ret1(){
        List<AddressBook> temp = new ArrayList<>();
        temp.add((AddressBook) ret());
        return (temp);
    }
   
    public void editConatact() {
        Scanner choices = new Scanner(System.in);
        Scanner inputs = new Scanner(System.in);
        System.out.println("press 1 to edit contact"+ "\n" + "press 2 for deleting contact");
        int choice = choices.nextInt();
        if(choice == 1) {
            System.out.println("enter the name of person u want to edit details for:");
            String in = inputs.nextLine();
            for(int i = 0;i<det.size();i++) {
                if((det.get(i)).getFirstName().equals(in)){
                    setDetails();
                    det.add(i,settingContactPersons);
                    break;
                }
            }
            System.out.println(det);
        }
        else if(choice == 2){
            System.out.println("enter the name of person u want to delete details for:");
            String in = inputs.nextLine();
            for(int i = 0;i<det.size();i++) {
                if((det.get(i)).getFirstName().equals(in)){
                    det.remove(i);
                    break;
                }
            }
            System.out.println(det);
        }
    }


    @Override
    public String toString() {
        return "AddressBook="+this.addressBookNumber+"[" + det + "]";
    }
    
    
}
