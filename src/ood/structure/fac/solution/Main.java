package ood.structure.fac.solution;

public class Main {
    public static void main(String[] args) {
        var service = new NotificationService();
        service.send("Code it all", "target");
    }
}
