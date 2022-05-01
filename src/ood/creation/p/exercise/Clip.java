package ood.creation.p.exercise;

public class Clip implements Component {
    @Override
    public Component clone() {
        //logic for cloning the current instance
        return new Clip();
    }
}
