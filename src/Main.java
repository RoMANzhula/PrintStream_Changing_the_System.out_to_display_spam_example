import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Main {
    public static PrinterClass printerClass = new PrinterClass(); //создаем обьект класса PrinterClass

    public static void main(String[] args) {
        PrintStream consoleIntellijIDEA = System.out; //создаем обьект класса PrintStream, в котором будем хранить базовую реализацию
        //метода (привычную для нас) для вывода данных

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //открываем поток для вывода байтов, который для
        //для вывода использует массив байтов(т.е. динамический массив байтов)

        PrintStream changingStream = new PrintStream(outputStream); //создаем обьект класса PrintStream, в котором будем
        // хранить подмененную реализацию метода для вывода данных

        System.setOut(changingStream); //устанавливаем его как текущий System.out


        printerClass.printInformation(); //вызываем метод печати какой-то информации (метод класса PrinterClass)

        String result = outputStream.toString(); //создаем строку, в которую преобразовываем записанные в динамический массив байты

        System.setOut(consoleIntellijIDEA); //возвращаем метод для вывода данных к базовому состоянию

        String[] linesArray = result.split("\\n"); //разбиваем считанные данные по "переносу строки" на отдельные строки
        for (int i = 0; i < linesArray.length; i++) { //проходимся по всем строкам
            System.out.println(linesArray[i]); //выводим каждую строку на печать
            if (i % 2 != 0) { //если индекс строки из массива строк при делении на 2 не будет выдавать 0, то
                System.out.println("Spam... Spam... Spam..."); //вставляем строку-спам, выводя ее на консоль каждый 3 рядок
            }
        }

    }

    public static class PrinterClass { //создаем класс для вывода на печать
        public void printInformation() { //создаем метод, который выводит на печать какую-то информацию
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