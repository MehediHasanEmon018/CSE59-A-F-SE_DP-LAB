
public class Main {
    public static void main(String[] args) {

        Printer p1 = new BasicPrinter();
        p1.printDocument();

        MultiFunctionCopier m1 = new MultiFunctionCopier();
        m1.printDocument();
        m1.scanDocument();
        m1.faxDocument();
    }
}


