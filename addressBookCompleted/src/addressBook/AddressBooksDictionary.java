package addressBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import addressBook.SearchFacility.SearchPersonByCity;
import addressBook.SearchFacility.SearchPersonByState;

public class AddressBooksDictionary implements SearchPersonByCity,SearchPersonByState {
    AddressBook addressBook;
    Map<Integer,List<ContactDetails>>  dictionary;
    public void createMultipleAddressBooks() {
        System.out.println("enter the number of,how many addressBook u want to store");
        Scanner numberOfAddressBook = new Scanner(System.in);
        int Count = numberOfAddressBook.nextInt();
        System.out.println("dictionary contains:"+" "+Count+" "+"addressbooks");
        dictionary = new HashMap<>();
        for(int i = 0;i<Count;i++) {
            addressBook = new AddressBook(i);
            System.out.println("u are in addressbook number :"+" "+i);
            dictionary.put(i,addressBook.ret());
        }
        
    }

    public void editConatactsOfAddressBook_InDictionary() {
        System.out.println("enter the name ,for which u want to edit details for");
        Scanner nameToChange = new Scanner(System.in);
        String in = nameToChange.nextLine();
        for(int i = 0;i<dictionary.size();i++) {
            for(int j = 0;j<dictionary.get(i).size();j++) {
                if(dictionary.get(i).get(j).getFirstName().equals(in)) {
                    addressBook.setDetails();
                    addressBook.det.add(j,addressBook.settingContactPersons );
                    break;
                }
            }
        }
    }

    @Override
    public void personView_byCity() {
        System.out.println("enter the name of city,to search for persons belong to that city");
        Scanner cityToSearchFor = new Scanner(System.in);
        String in = cityToSearchFor.nextLine();
        for(int i = 0;i<dictionary.size();i++) {
            for(int j = 0;j<dictionary.get(i).size();j++) {
                if(((dictionary.get(i)).get(j)).getCity().equals(in)) {
                    System.out.println("AddressBook : "+i+(dictionary.get(i)).get(j));
                }
            }
        }
    }

    @Override
    public void personView_byState() {
        System.out.println("enter the name of ,to search for persons belong to that State");
        Scanner stateToSearchFor = new Scanner(System.in);
        String in = stateToSearchFor.nextLine();
        for(int i = 0;i<dictionary.size();i++) {
            for(int j = 0;j<dictionary.get(i).size();j++) {
                if(((dictionary.get(i)).get(j)).getState().equals(in)) {
                    System.out.println("AddressBook : "+i+(dictionary.get(i)).get(j));
                }
            }
        }
    }

    public void displayDictionary(){
        System.out.print(dictionary);
    }

}
