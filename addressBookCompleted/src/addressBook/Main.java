package addressBook;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import addressBook.utility.FileIOStreamOperations;

public class Main {
    public static void main(String args[]) {
        AddressBooksDictionary addressBookDictionary = new AddressBooksDictionary();
        addressBookDictionary.createMultipleAddressBooks();
        Scanner takeChoice = new Scanner(System.in);
        System.out.println("press 1 to edit Contacts"+"\n"+"press 2 to pass");
        try{
            int num = Integer.parseInt(takeChoice.nextLine());
            int choice = num;
            if(choice == 1) {
                addressBookDictionary.editConatactsOfAddressBook_InDictionary();
            }
            else if(choice == 2) {
                //pass
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Error! Invalid value,execution will Stop here");
        }
        
        addressBookDictionary.displayDictionary();
        addressBookDictionary.personView_byCityOrState();
        Map<Integer, List<ContactDetails>> se = addressBookDictionary.getDictionary();

        FileIOStreamOperations fileIOStreamOperations = new FileIOStreamOperations();
        fileIOStreamOperations.writeFile(se);
        fileIOStreamOperations.readFile();
    }
}
