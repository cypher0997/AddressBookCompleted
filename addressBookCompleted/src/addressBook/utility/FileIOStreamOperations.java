package addressBook.utility;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


import addressBook.AddressBooksDictionary;
import addressBook.ContactDetails;
import addressBook.utility.read_writeFacility.*;
import addressBook.utility.read_writeFacility.Readable;

public class FileIOStreamOperations implements Readable,Writeable{ 
    AddressBooksDictionary addressBookDictionary = new AddressBooksDictionary();
    public void createAddressBookDictionary (){ 
        addressBookDictionary.createMultipleAddressBooks();
    }
    
    @Override
    public void readFile() {
        try{
            Files.lines(new File("D:\\testout.txt").toPath())
            .map(s -> s.trim())
            .filter(s -> !s.isEmpty())
            .forEach(System.out::println);
        }catch(IOException e){
            System.out.println(e);
        }
        
    }

    @Override
    public void writeFile(Map<Integer, List<ContactDetails>> take) {
        try{
            FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
            String s=take.toString();
            byte b[]=s.getBytes();
            fout.write(b);    
            fout.close();    
            System.out.println("success...");  
        }catch(Exception e){
            System.out.println(e);
        }
    }
 
}