package ood.behavior.str.solution;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    /*public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }*/

    public void store(String filename, Compressor compressor, Filter filter) {
        compressor.compress(filename);
        filter.apply(filename);
    }
}
