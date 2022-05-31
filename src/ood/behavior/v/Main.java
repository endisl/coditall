package ood.behavior.v;

public class Main {
    public static void main(String[] args) {
        var wavFile = WavFile.read("file1");
        wavFile.execute(new NoiseOperation());
    }
}
