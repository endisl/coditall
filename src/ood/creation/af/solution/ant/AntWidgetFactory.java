package ood.creation.af.solution.ant;

import ood.creation.af.solution.Button;
import ood.creation.af.solution.TextBox;
import ood.creation.af.solution.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
