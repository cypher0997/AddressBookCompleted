package addressBook;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner choice = new Scanner(System.in);
        StoringMultipleContact storeMultiple_Contact = new StoringMultipleContact();
        storeMultiple_Contact.AddContactRefactored();
        System.out.println("enter 0 to pass this section, enter 1 to edit details, enter 2 to delete contact");
        int input = choice.nextInt();
        if(input == 1) {
           storeMultiple_Contact.editContactPersonDetail();
        }
        else if(input == 2){
            storeMultiple_Contact.RemoveContactPersons();
        }
    }
}
