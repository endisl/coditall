package ood.creation.fm.solution.smart;

import ood.creation.fm.solution.ndion.ViewEngine;

import java.util.Map;

public class SmartViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Smart";
    }
}
