package ood.creation.s.solution;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Endi");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
        //output: Endi
    }
}
