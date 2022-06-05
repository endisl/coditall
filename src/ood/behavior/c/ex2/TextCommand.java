package ood.behavior.c.ex2;

public class TextCommand implements UndoableCommand {
    private String text;
    private VideoEditor videoEditor;
    private  History history;

    public TextCommand(String text, VideoEditor videoEditor, History history) {
        this.text = text;
        this.videoEditor = videoEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        videoEditor.setText(text);
        history.push(this);
    }

    @Override
    public void unexecute() {
        videoEditor.removeText();
    }
}
