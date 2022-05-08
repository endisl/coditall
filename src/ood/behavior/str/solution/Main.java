package ood.behavior.str.solution;

public class Main {
    public static void main(String[] args) {
        //var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        //imageStorage.store("a");

        var imageStorage = new ImageStorage();
        imageStorage.store("a", new PngCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new JpegCompressor(), new HighContrastFilter());
    }
}
