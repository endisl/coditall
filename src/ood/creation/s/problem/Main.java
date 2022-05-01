package ood.creation.s.problem;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = new ConfigManager();
        manager.set("name", "Endi");

        ConfigManager other = new ConfigManager();
        System.out.println(other.get("name"));
        //output: null
    }
}
