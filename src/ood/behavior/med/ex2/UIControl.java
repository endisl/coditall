package ood.behavior.med.ex2;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler handler) {
        eventHandlers.add(handler);
    }

    protected void notifyEventHandlers() {
        for (var handler: eventHandlers)
            handler.handle();
    }
}
