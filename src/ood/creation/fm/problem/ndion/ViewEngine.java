package ood.creation.fm.problem.ndion;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}
