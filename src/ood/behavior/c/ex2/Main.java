package ood.behavior.c.ex2;

public class Main {
    public static void main(String[] args) {
        var history = new History();
        var editor = new VideoEditor();
        var setText = new TextCommand("command pattern", editor, history);
        setText.execute();
        System.out.println("Editor: " + editor);

        var setContrast = new ContrastCommand(1.5f, editor, history);
        setContrast.execute();
        System.out.println("Editor: " + editor);

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("Editor: " + editor);

        undoCommand.execute();
        System.out.println("Editor: " + editor);

        undoCommand.execute();
        System.out.println("Editor: " + editor);
    }


    /*Output
    Editor: VideoEditor{contrast=0.5, text='command pattern'}
    Editor: VideoEditor{contrast=1.5, text='command pattern'}
    Editor: VideoEditor{contrast=0.5, text='command pattern'}
    Editor: VideoEditor{contrast=0.5, text=''}
    Editor: VideoEditor{contrast=0.5, text=''}
    */
}
