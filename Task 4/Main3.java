public interface Printer {
    void printDocument();
}

public interface Scanner {
    void scanDocument();
}

public interface Fax {
    void faxDocument();
}

class MultiFunctionCopier implements Printer, Scanner, Fax {

    public void printDocument() {
        System.out.println("Printing...");
    }

    public void scanDocument() {
        System.out.println("Scanning...");
    }

    public void faxDocument() {
        System.out.println("Faxing...");
    }
}

class BasicPrinter implements Printer {

    public void printDocument() {
        System.out.println("Printing...");
    }
}

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
