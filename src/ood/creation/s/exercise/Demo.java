package ood.creation.s.exercise;

public class Demo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance("file1");
        Logger logger2 = Logger.getInstance("file1");
        System.out.println(logger1 == logger2);
        //output: true

        logger1.write("Logger content");

        Logger logger3 = Logger.getInstance("file2");
        System.out.println(logger1 == logger3);
        //output: false
    }
}
