package ood.behavior.cr;

public class Numbers extends Handler {
    public Numbers(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String filename) {
        if (filename.endsWith(".numbers"))
            System.out.println("Reading data from a Numbers spreadsheet.");
        return false;
    }
}
