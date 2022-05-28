package ood.behavior.cr;

public class DataReader {
    public void read(String filename) {
        if (filename.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
        }
        else if (filename.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
        }
        else if (filename.endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
        }
        else
            throw new UnsupportedOperationException("File format not supported.");
    }
}
