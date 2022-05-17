package ood.behavior.mem;

public class Demo {
    public static void main(String[] args) {
        var document = new Document();
        var history = new History();

        document.setContent("Code");
        history.push(document.createMemento());

        document.setFontName("Times");
        history.push(document.createMemento());

        document.setFontSize(10);

        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);
    }
}
