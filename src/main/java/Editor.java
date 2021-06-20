import java.io.IOException;
import java.util.Scanner;

public class Editor {
    final static Scanner myScanner = new Scanner(System.in);
    Editor editor = this;

    public void doTasks() throws IOException {
        System.out.println("Press number : \n" +
                "0 - to quit \n" +
                "1 - print menu \n" +
                "2 - save tab to file \n" +
                "3 - read file \n" +
                "4 - Sum arrays from file \n" +
                "5 - Multiply arrays from file \n" +
                "6 - Undo last operation \n");

        boolean flag = true;
        while (flag) {
            switch (myScanner.nextInt()) {
                case 0:
                    flag = false;
                    System.out.println("End of transaction");
                    break;
                case 1:
                    printMenu();
                    break;
                case 2:
                    SaveTabToFile saveTabToFile = new SaveTabToFile(editor);
                    saveTabToFile.doSomething();
                    System.out.println("---------");
                    break;
                case 3:
                    OpenFile openFile = new OpenFile(editor);
                    openFile.doSomething();
                    System.out.println("---------");
                    break;
                case 4:
                    SumTables sumTables = new SumTables(editor);
                    sumTables.doSomething();
                    System.out.println("---------");
                    break;
                case 5:
                    MultiplyTable multiplyTable = new MultiplyTable(editor);
                    multiplyTable.doSomething();
                    System.out.println("---------");
                    break;
                case 6:
                    System.out.println("undo");
                    System.out.println("---------");
                    break;
            }
        }
    }

    private void saveTabToFile() {
        new SaveTabToFile(editor);
    }

    public void printMenu() {
        System.out.println("Press number : \n" +
                "0 - to quit \n" +
                "1 - print menu \n" +
                "2 - save tab to file \n" +
                "3 - read file \n" +
                "4 - Sum tables from file \n" +
                "5 - Multiply tables from file \n" +
                "6 - Undo last operation \n");
    }
}
