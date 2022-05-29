package ood.behavior.cr;

public class Main {
    public static void main(String[] args) {
       var reader = DataReaderFactory.getDataReaderChain();
       reader.read("data.xls");
       reader.read("data.numbers");
       reader.read("data.qbw");
       reader.read("data.png");
    }
}
