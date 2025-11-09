interface Printer {
    void connect ();
    default void details() {
        System.out.println("Printer: Provides a hard copy of a picture or document from the computer");
    }
}
interface Scanner {
    void connect();
    default void details() {
        System.out.println("Scanner: Scans a hard copy of a picture or document and transfers a soft copy to the computer");
    }
}
class MultiFunctionMachine implements Printer, Scanner {
    @Override
    public void connect() {
        System.out.println("Connect the device to the computer");
    }
    @Override
    public void details() {
        System.out.println("This is a multi function machine");
        Printer.super.details();
        Scanner.super.details();
    }
}
public class w11_4 {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();
        m.connect();
        m.details();
    }
}
