package ood.creation.p.exercise;

public class ContextMenu {
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        Component newComponent = component.clone();
        timeline.add(newComponent);
    }
}
