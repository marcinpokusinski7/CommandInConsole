import java.io.IOException;

public abstract class Command {
    public Editor editor;

    public Command(Editor editor) {
        this.editor = editor;
    }

   public abstract boolean doSomething() throws IOException;
}
