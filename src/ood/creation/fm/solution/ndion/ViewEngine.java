package ood.creation.fm.solution.ndion;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}
