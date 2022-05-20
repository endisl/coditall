package ood.behavior.sta;

public class Demo {
    public static void main(String[] args) {
        var service = new DirectionService(new Transit()); //starting with a default mode
        service.getEta();
        service.setMode(new Driving());
        service.getEta();
        service.getDirection();
        service.setMode(new Walking());
        service.getDirection();
        service.getEta();
    }
}
