package addressBook;

public class Main {
    public static void main(String args[]){
        System.out.println("welcome to addressBook");
        AddContact toAddPersonContact = new AddContact("anurag","bhardwaj","N/a","jaipur","rajasthan","anuragcypher@gmail.com",303002,"6350391128");
        toAddPersonContact.display();
    }
}
