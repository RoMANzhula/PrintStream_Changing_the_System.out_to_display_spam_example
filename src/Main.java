import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Main {
    public static PrinterClass printerClass = new PrinterClass();
    
    public static void main(String[] args) {
        PrintStream consoleIntellijIDEA = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream changingStream = new PrintStream(outputStream); 
        
        System.setOut(changingStream)

        printerClass.printInformation();

        String result = outputStream.toString();

        System.setOut(consoleIntellijIDEA);

        String[] linesArray = result.split("\\n");
        for (int i = 0; i < linesArray.length; i++) {
            System.out.println(linesArray[i]);
            if (i % 2 != 0) {
                System.out.println("Spam... Spam... Spam...");
            }
        }

    }

    public static class PrinterClass {
        public void printInformation() {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
        }
    }
}
