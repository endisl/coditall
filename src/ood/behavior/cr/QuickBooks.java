package ood.behavior.cr;

public class QuickBooks extends Handler {
    public QuickBooks(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String filename) {
        if (filename.endsWith(".qbw"))
            System.out.println("Reading data from a QuickBooks file.");
        return false;
    }
}
