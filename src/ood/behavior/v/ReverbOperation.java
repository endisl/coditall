package ood.behavior.v;

public class ReverbOperation implements Operation {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Add reverb on fact segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Add reverb on format segment");
    }
}
