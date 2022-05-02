package ood.creation.fm.solution.ndion;

import java.util.Map;

public class NdionViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Ndion";
    }
}
