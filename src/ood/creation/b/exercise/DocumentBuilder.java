package ood.creation.b.exercise;

public interface DocumentBuilder {
    void addText(Text text);
    void addImage(Image image);
    String getResult();
}
