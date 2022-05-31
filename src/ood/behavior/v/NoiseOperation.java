package ood.behavior.v;

public class NoiseOperation implements Operation {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reduce noise on fact segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reduce noise on format segment");
    }
}
