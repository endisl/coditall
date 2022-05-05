package ood.creation.b.exercise;

import ood.creation.b.exercise.Html.HtmlDocument;
import ood.creation.b.exercise.Html.HtmlImage;
import ood.creation.b.exercise.Html.HtmlParagraph;

public class HtmlDocumentBuilder implements DocumentBuilder {
    private HtmlDocument document = new HtmlDocument();


    @Override
    public void addText(Text text) {
        document.add(new HtmlParagraph(text.getContent()));
    }

    @Override
    public void addImage(Image image) {
        document.add(new HtmlImage(image.getSource()));
    }

    @Override
    public String getResult() {
        return document.toString();
    }
}
