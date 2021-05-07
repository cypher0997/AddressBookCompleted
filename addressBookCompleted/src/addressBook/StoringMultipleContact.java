package addressBook;

import java.util.Scanner;

public class StoringMultipleContact {
    public void AddContactRefactored() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of user you want to enter");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int comp = (int)n;
        AddContact Storage[] = new AddContact[n];
        AddContact ob = new AddContact();
        for(int i = 0;i<Storage.length;i++)
        {   
            System.out.print("Enter FirstName  : ");
            String firstName = sc.nextLine();
            System.out.print("Enter LastNmae  : ");
            String lastName = sc.nextLine();
            System.out.print("Enter Address  : ");
            String address = sc.nextLine(); 
            System.out.print("Enter City  : ");
            String city = sc.nextLine();
            System.out.print("Enter State : ");
            String state = sc.nextLine();
            System.out.print("Enter PhoneNUmber : ");
            String phoneNumber = sc.nextLine();
            System.out.print("Enter Zip : ");
            int zip = sc.nextInt();
            Storage[i] = new AddContact(firstName, lastName, address, city, state, zip, phoneNumber);
            System.out.println(" ");
            if(comp > 1)
            {
                System.out.println("enter deatils of next user ");
            }         
        }
        for(int i = 0; i<Storage.length; i++) 
        {
            Storage[i].display(i);
            System.out.println(" ");
        }
    }
}
