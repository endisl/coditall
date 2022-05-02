package ood.creation.af.solution.material;

import ood.creation.af.solution.Button;
import ood.creation.af.solution.TextBox;
import ood.creation.af.solution.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
