package ood.behavior.o.ex2;

public class Main {
    public static void main(String[] args) {
        var stock1 = new Stock("stk1", 10);
        var stock2 = new Stock("stk2", 50);
        var stock3 = new Stock("stk3", 100);
        var statusBar = new StatusBar();
        var listView = new StockListView();

        listView.addStock(stock1);
        listView.addStock(stock2);
        listView.addStock(stock3);

        statusBar.addStock(stock2);
        statusBar.addStock(stock3);

        statusBar.show();
        listView.show();

        stock1.setPrice(12.5f);
        stock2.setPrice(47.5f);
    }
}
