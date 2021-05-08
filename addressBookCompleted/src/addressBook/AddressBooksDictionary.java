package addressBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBooksDictionary {
    AddressBook addressBook;
    Map<Integer,AddressBook> dictionary;
    public void createMultipleAddressBooks() {
        Scanner numberOfAddressBook = new Scanner(System.in);
        int Count = numberOfAddressBook.nextInt();
        System.out.println("dictionary contains:"+" "+Count+" "+"addressbooks");
        dictionary = new HashMap<>();
        for(int i = 0;i<Count;i++) {
            addressBook = new AddressBook(i);
            System.out.println("u are in addressbook number :"+" "+i);
            addressBook.ret();
            dictionary.put(i,addressBook);
        }
        for(AddressBook value: dictionary.values()){
            System.out.println(value);
        }
    }

}
