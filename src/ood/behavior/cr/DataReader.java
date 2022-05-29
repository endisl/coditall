package ood.behavior.cr;

public class DataReader {
    private Handler handler;

    public DataReader(Handler handler) {
        this.handler = handler;
    }

    public void handle(String filename) {
        handler.handle(filename);
    }
}
