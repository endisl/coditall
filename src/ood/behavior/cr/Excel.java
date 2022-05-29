package ood.behavior.cr;

public class Excel extends Handler {
    public Excel(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String filename) {
        if (filename.endsWith(".xls"))
            System.out.println("Reading data from an Excel spreadsheet.");
        return false;
    }
}
