package ood.creation.p.solution;

public class ContextMenu {
    public void duplicate(Component component) {
        Component newComponent = component.clone();
        //add target to our document
    }
}

/*problems:
  - violate open/closed principle (others "if statement" in order to support other shapes)
  - coupling between ContextMenu and Circle (and other shapes supported)
  - at the time of writing code ContextMenu has to know about all kinds of components (not possible to achieve extensibility)
*/