package ood.behavior.cr;

public class QuickBooksReader extends DataReader {

    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    protected void doRead(String filename) {
        System.out.println("Reading data from a QuickBooks file.");
    }
}
