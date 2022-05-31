package ood.behavior.v;

public class NormalizeOperation implements Operation {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Normalize");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Normalize");
    }
}
