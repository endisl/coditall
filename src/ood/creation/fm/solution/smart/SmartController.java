package ood.creation.fm.solution.smart;

import ood.creation.fm.solution.ndion.Controller;
import ood.creation.fm.solution.ndion.ViewEngine;

public class SmartController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SmartViewEngine();
    }
}
