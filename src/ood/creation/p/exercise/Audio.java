package ood.creation.p.exercise;

public class Audio implements Component {
    @Override
    public Component clone() {
        //logic for cloning the current instance
        return new Audio();
    }
}
