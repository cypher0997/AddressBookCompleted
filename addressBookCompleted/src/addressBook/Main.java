package addressBook;


public class Main {
    public static void main(String args[]) {
        AddressBooksDictionary addressBookDictionary = new AddressBooksDictionary();
        addressBookDictionary.createMultipleAddressBooks();
        addressBookDictionary.editConatactsOfAddressBook_InDictionary();
        addressBookDictionary.displayDictionary();
    }
}
