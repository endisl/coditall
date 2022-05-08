package ood.structure.c.exercise;

import java.util.ArrayList;
import java.util.List;

public class Team implements Component {
    private List<Component> resources = new ArrayList<>();

    public void add(Component resource) {
        resources.add(resource);
    }

    @Override
    public void deploy() {
        for (var resource: resources)
            resource.deploy();
    }
}
