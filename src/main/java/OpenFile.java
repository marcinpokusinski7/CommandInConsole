import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OpenFile extends Command {

    public OpenFile(Editor editor) {
        super(editor);
    }

    @Override
    public boolean doSomething() throws IOException {
        File myFile = new File("file.txt");
        if (myFile.exists()) {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
        return false;
    }
}
