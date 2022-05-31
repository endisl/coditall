package ood.behavior.v;

public class NoiseOperation implements Operation {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reduce noise");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reduce noise");
    }
}
