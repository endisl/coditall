package ood.creation.p.exercise;

public class Text implements Component {

    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Component clone() {
        Text newText = new Text(getContent());
        return newText;
    }
}
