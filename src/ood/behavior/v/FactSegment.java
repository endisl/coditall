package ood.behavior.v;

public class FactSegment implements Segment {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
