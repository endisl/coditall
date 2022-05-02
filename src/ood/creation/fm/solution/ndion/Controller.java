package ood.creation.fm.solution.ndion;

import javax.swing.text.View;
import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context) {
        var engine = createViewEngine();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected ViewEngine createViewEngine() {
        return new NdionViewEngine(); //supplying a default implementation
    }

    //protected abstract ViewEngine createViewEngine();
}
