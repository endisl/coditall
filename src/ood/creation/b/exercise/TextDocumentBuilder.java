package ood.creation.b.exercise;

public class TextDocumentBuilder implements DocumentBuilder {
    private StringBuilder builder = new StringBuilder();

    @Override
    public void addText(Text text) {
        builder.append(text.getContent());
    }

    @Override
    public void addImage(Image image) {
        //no implementation
    }

    @Override
    public String getResult() {
        return builder.toString();
    }
}
