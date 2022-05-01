package ood.creation.p.exercise;

public class Demo {
    public static void main(String[] args) {
        Timeline timeline = new Timeline();
        Text text = new Text("Hi!");
        timeline.add(text);

        ContextMenu menu = new ContextMenu(timeline);
        menu.duplicate(text);

        for (Component component : timeline.getComponents()) {
            Text textComponent = (Text)component;
            System.out.println(textComponent.getContent());
        }

    }
}
