package addressBook;

import java.util.Scanner;

public class StoringMultipleContact {

    private int comp;
    AddContact Storage[];

    public void AddContactRefactored() {
        System.out.println("enter the number of user you want to enter");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        comp = (int)n;
        Storage = new AddContact[comp] ;
        for(int i = 0;i<Storage.length;i++)
        {   
            Scanner sc = new Scanner(System.in);
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
            if(comp > 1 && comp == n-1 )
            {
                System.out.println("enter deatils of next user ");
            }         
        }
        display();
    }

    public void display() {
        for(int i = 0; i<Storage.length; i++) 
        {
            Storage[i].display(i);
            System.out.println(" ");
        }
    }

    public void editContactPersonDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the username you want to edit");
        Scanner uname = new Scanner(System.in);
        String name = uname.nextLine();
        for(int i = 0; i<Storage.length; i++) {
            if( Storage[i].getFirstName().equals(name)){
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
                display();
            } 
        }
    }

    public void RemoveContactPersons() {
        System.out.println("enter the username you want to delete");
        Scanner uname = new Scanner(System.in);
        String name = uname.nextLine();
        for(int i = 0; i<Storage.length; i++) 
        {
            if( Storage[i].getFirstName().equals(name)){
                for (int j = i; j < Storage.length - 1; j++) {
                    Storage[j] = Storage[j + 1];
                }
                display();
                break;
            }
        }
    }
   
}
