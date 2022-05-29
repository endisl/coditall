package ood.behavior.cr;

public class Main {
    public static void main(String[] args) {
        var numbers = new Numbers(null);
        var excel = new Excel(numbers);
        var reader = new DataReader(excel);
        reader.handle("test.xls");
    }
}
