import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SaveTabToFile extends Command {
    public static final Scanner sc = new Scanner(System.in);

    public SaveTabToFile(Editor editor) {
        super(editor);
    }

    @Override
    public boolean doSomething() {
        try {
            File myFile = new File("file.txt");
            FileWriter myWriter = new FileWriter(myFile);
            int n = 5;
            int[] tab = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("provide five numbers, number " + i + " : ");
                tab[i] = sc.nextInt();
            }
            myWriter.write(Arrays.toString(tab));
            myWriter.close();

            if (myFile.exists()) {
                Scanner scanner = new Scanner(myFile);
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            }
        } catch (IOException e) {
            System.out.println("File creation went wrong");
            e.printStackTrace();
        }
        return true;
    }
}
