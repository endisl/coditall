package ood.behavior.c.ex1.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
