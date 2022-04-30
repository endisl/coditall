package ood.creation.p.problem;

public class ContextMenu {
    public void duplicate(Component component) {
        if (component instanceof Circle) {
            Circle source = (Circle)component;
            Circle target = new Circle();
            target.setRadius(source.getRadius());
            //add target to our document
        }
    }
}

/*problems:
  - violate open/closed principle (others "if statement" in order to support other shapes)
  - coupling between ContextMenu and Circle (and other shapes supported)
  - at the time of writing code ContextMenu has to know about all kinds of components (not possible to achieve extensibility)
*/