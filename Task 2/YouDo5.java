
public class Main{
    public static void main(String[] args){
        Printer printer = new Printer();
        
        printer.printData("Hello Java");
        printer.printData(100);
    }
}

class Printer{
    void printData(String text){
        System.out.println("Text: "+ text);
        
    }
    void printData(int number){
        System.out.println("Number: "+ number);
        
    }
}

