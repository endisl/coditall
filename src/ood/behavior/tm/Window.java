package ood.behavior.tm;

public abstract class Window {
    public void close() {
        beforeClose();
        System.out.println("Removing the window from the screen");
        afterClose();
    }
    protected abstract void beforeClose();
    protected abstract void afterClose();
}
