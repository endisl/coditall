package ood.creation.b.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void export(DocumentBuilder builder, String filename) throws IOException {

        for (Element element : elements) {
            if (element instanceof Text)
                builder.addText((Text) element);
            else if (element instanceof Image)
                builder.addImage((Image) element);
        }

        var writer = new FileWriter(filename);
        writer.write(builder.getResult());
        writer.close();
    }
}
