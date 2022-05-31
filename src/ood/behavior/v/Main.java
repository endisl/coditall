package ood.behavior.v;

public class Main {
    public static void main(String[] args) {
        var wavFile = WavFile.read("file1.wav");
        wavFile.execute(new NoiseOperation());
        wavFile.execute(new ReverbOperation());
        wavFile.execute(new NormalizeOperation());
    }
}
