import java.io.IOException;
import java.util.Scanner;

public class Editor {
    final static Scanner myScanner = new Scanner(System.in);
    Editor editor = this;
    private UndoTask undoTask = new UndoTask();

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
                    performTask(new SaveTabToFile(editor));
                    System.out.println("---------");
                    break;
                case 3:
                    performTask(new OpenFile(editor));
                    System.out.println("---------");
                    break;
                case 4:
                    performTask(new SumTables(editor));
                    System.out.println("---------");
                    break;
                case 5:
                    performTask(new MultiplyTable(editor));
                    System.out.println("---------");
                    break;
                case 6:
                    System.out.println("undo");
                    undo();
                    break;
            }
        }
    }

    private void performTask(Command command) throws IOException {
        if (command.doSomething()) {
            undoTask.push(command);
        }
    }

    private void undo() {
        if (undoTask.isEmpty()) return;

        Command command = undoTask.pop();
        if (command != null) {
            command.hasUndo();
        }
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
