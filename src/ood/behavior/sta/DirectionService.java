package ood.behavior.sta;

public class DirectionService {
    private TravelMode mode;

    public DirectionService(TravelMode mode) {
        this.mode = mode;
    }

    public Object getEta() {
        return mode.getEta();
    }

    public Object getDirection() {
        return mode.getDirection();
    }

    public TravelMode getMode() {
        return mode;
    }

    public void setMode(TravelMode mode) {
        this.mode = mode;
    }
}
