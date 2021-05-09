package addressBook.utility;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.Writer;
import java.io.FileWriter;
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
    public void readTxtFile() {
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
    public void writeTxtFile(Map<String,List<ContactDetails>> take) {
        try{
            FileOutputStream fout=new FileOutputStream("D:\\testout.csv");
            String s=take.toString();
            byte b[]=s.getBytes();
            fout.write(b);    
            fout.close();    
            System.out.println("success...");  
        }catch(Exception e){
            System.out.println(e);
        }
    }
 
    @Override
    public void readCsvFile() {
        try{
            Files.lines(new File("D:\\somefile.csv").toPath())
            .map(s -> s.trim())
            .filter(s -> !s.isEmpty())
            .forEach(System.out::println);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    @Override
    public void writeCsvFile(Map<String, List<ContactDetails>> take) {
        String eol = System.getProperty("line.separator");
        try (Writer writer = new FileWriter("D:\\somefile.csv")) {
        for (Map.Entry<String,List<ContactDetails>>entry : take.entrySet()) {
            writer.append(entry.getKey())
            .append(',')
            .append((entry.getValue()).toString())
            .append(eol);
        }
    } catch (IOException ex) {
        ex.printStackTrace(System.err);
    }
    }
}