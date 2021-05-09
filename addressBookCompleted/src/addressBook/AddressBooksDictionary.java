package addressBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import addressBook.searchFacility.Searchable;



public class AddressBooksDictionary implements Searchable {
    AddressBook addressBook;
    public Map<Integer,List<ContactDetails>>  dictionary;
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
    public void personView_byCityOrState() { 
        Scanner choice = new Scanner(System.in);
        Scanner city_stateToSearchFor = new Scanner(System.in);
        try{
            System.out.println("press 1 to search in city"+"\n"+"press 2 to search in state"+"\n"+"press 3 to skip");
            int num = Integer.parseInt(city_stateToSearchFor.nextLine());
            int inputForCityOrState = num;
            if(inputForCityOrState == 1) {
                System.out.println("enter the name of city ,to search for persons belong to that city ");
                String in = city_stateToSearchFor.nextLine();
                for(int i = 0;i<dictionary.size();i++) {
                    for(int j = 0;j<dictionary.get(i).size();j++) {
                        if(((dictionary.get(i)).get(j)).getCity().equals(in)) {
                            System.out.println("AddressBook : "+i+(dictionary.get(i)).get(j));
                            System.out.println("number od users brlong to " + in +" "+ "is" + " "+ j+1);
                            System.out.println(" ");
                        }
                    }
                }
            }
            if(inputForCityOrState == 2) {
                System.out.println("enter the name of State ,to search for persons belong to that State ");
                String in = city_stateToSearchFor.nextLine();
                for(int i = 0;i<dictionary.size();i++) {
                    for(int j = 0;j<dictionary.get(i).size();j++) {
                        if(((dictionary.get(i)).get(j)).getState().equals(in)) {
                            System.out.println("AddressBook : "+i+(dictionary.get(i)).get(j));
                            System.out.println("number od users brlong to " + in +" "+ "is" + " "+ j+1);
                            System.out.println(" ");
                        }
                    }
                }
            }  
            if(inputForCityOrState == 3){
            //pass
            }
        }catch (NumberFormatException e) {
            System.out.println("Error! Invalid value,give valid number");
            personView_byCityOrState();
        }
    }

    public void displayDictionary(){
        System.out.print(dictionary);
        System.out.println(" ");
    }

    public Map<Integer, List<ContactDetails>> getDictionary() {
        return dictionary;
    }


    
}
