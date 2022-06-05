package ood.behavior.c.ex2;

public class ContrastCommand implements UndoableCommand {
    private float prevContrast;
    private float contrast;
    private VideoEditor videoEditor;
    private History history;

    public ContrastCommand(float contrast, VideoEditor videoEditor, History history) {
        this.contrast = contrast;
        this.videoEditor = videoEditor;
        this.history = history;
        prevContrast = videoEditor.getContrast();
    }

    @Override
    public void execute() {
        videoEditor.setContrast(contrast);
        history.push(this);
    }

    @Override
    public void unexecute() {
        videoEditor.setContrast(prevContrast);
    }
}
