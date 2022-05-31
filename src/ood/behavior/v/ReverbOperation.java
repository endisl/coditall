package ood.behavior.v;

public class ReverbOperation implements Operation {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Add reverb");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Add reverb");
    }
}
