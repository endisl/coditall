package ood.creation.p.problem;

public class Circle implements Component {
    private int radius;

    @Override
    public void render() {
        System.out.println("Rendering a circle");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
