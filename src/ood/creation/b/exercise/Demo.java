package ood.creation.b.exercise;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        var document = new Document();
        document.add(new Text("Hi there"));
        document.add(new Image("picture.jpg"));
        document.export(ExportFormat.HTML, "export.html");
        document.export(ExportFormat.TEXT, "export.txt");
    }
}
