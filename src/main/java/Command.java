import java.io.IOException;

public abstract class Command {
    public Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public abstract boolean doSomething() throws IOException;

    public void hasUndo(){
        backup = editor.toString();
    }

    public void undo() {
        editor.toString();
    }
}
