package ood.behavior.o.ex1;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet got notified: " + value);
    }
}
