package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    /*following method is used ask number of user to be stored*/
    public int numberOfUser() {
        System.out.println("enter the number of users u want to store");
        Scanner numberOfUsers = new Scanner(System.in);
        int num = numberOfUsers.nextInt();
        return num;
    }

    Contact settingContactPersons;
    
    public void setName() {
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
        int zip =takeInput.nextInt();

        settingContactPersons = new Contact(firstName,lastName,address,city,state,zip,phoneNumber);
    
    }


    /*this method is main execution sequence */
    public void ret() {
        int count=1;
        List<Contact> det = new ArrayList<>();
        int numberOfUser = numberOfUser();
        Contact setId = new Contact(count);
        for(int i = 0;i<numberOfUser;i++) {
            System.out.println("enter th detail of user:"+i);
            setName();
            while(true) {
                det.add(settingContactPersons);
                break;
            }
            count++;
        }
        System.out.println(det);
    }
   
}
