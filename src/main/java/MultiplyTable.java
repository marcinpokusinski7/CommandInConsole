import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MultiplyTable extends Command{

    public MultiplyTable(Editor editor) {
        super(editor);
    }

    @Override
    public boolean doSomething() throws IOException {
        List<Integer> tab = new ArrayList<>();
        File myFile = new File("file.txt");

        if (myFile.exists()) {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNext()) {
                for (String s : scanner.nextLine().replace("[", "").replace("]", "").split("\\s*,\\s*")) {
                    tab.add(Integer.parseInt(s));
                }
                System.out.println("Insert number to multiply array: ");
                Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();
                System.out.println(Arrays.toString(tab.stream()
                        .mapToInt(x -> x * number)
                        .toArray()));
                hasUndo();
            }
        }
        return false;
    }


}
