
public class Main1 {
    interface Printer {
        void printDocument();
    }

    interface Scanner {
        void scanDocument();
    }

    interface FaxMachine {
        void faxDocument();
    }

    static class MultiFunctionCopier implements Printer, Scanner, FaxMachine {

        @Override
        public void printDocument() {
            System.out.println("Printing...");
        }

        @Override
        public void scanDocument() {
            System.out.println("Printing...");
        }

        @Override
        public void faxDocument() {
            System.out.println("Printing...");
        }
    }

    static class BasicPrinter implements Printer {

        @Override
        public void printDocument() {
            System.out.println("Printing...");
        }
    }

    public static void main(String[] args) {
        System.out.println("MultiFunction copier");
        MultiFunctionCopier copier = new MultiFunctionCopier();
        copier.printDocument();
        copier.scanDocument();
        copier.faxDocument();

        System.out.println("Basic Printer");
        BasicPrinter printer = new BasicPrinter();
        printer.printDocument();
    }
}
