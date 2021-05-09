package addressBook;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        AddressBooksDictionary addressBookDictionary = new AddressBooksDictionary();
        addressBookDictionary.createMultipleAddressBooks();
        System.out.println("press 1 to edit Contacts"+"\n"+"press 2 to pass");
        Scanner takeChoice = new Scanner(System.in);
        int choice = takeChoice.nextInt();
        if(choice == 1) {
            addressBookDictionary.editConatactsOfAddressBook_InDictionary();
        }
        else if(choice == 2) {
            //pass
        }
        addressBookDictionary.displayDictionary();
        addressBookDictionary.personView_byCity();
        addressBookDictionary.personView_byState();
    }
}
