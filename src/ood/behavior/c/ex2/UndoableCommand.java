package ood.behavior.c.ex2;

public interface UndoableCommand extends Command {
    void unexecute();
}
