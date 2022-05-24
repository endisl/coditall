package ood.behavior.o.ex1;

public class Chart implements Observer {
    @Override
    public void update() {
        System.out.println("Chart got updated");
    }
}
