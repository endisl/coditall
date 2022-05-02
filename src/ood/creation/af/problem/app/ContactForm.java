package ood.creation.af.problem.app;

import ood.creation.af.problem.Theme;
import ood.creation.af.problem.ant.AntButton;
import ood.creation.af.problem.ant.AntTextBox;
import ood.creation.af.problem.material.MaterialButton;
import ood.creation.af.problem.material.MaterialTextBox;

public class ContactForm {
    public void render(Theme theme) {
        if (theme == Theme.ANT) {
            new AntTextBox().render();
            new AntButton().render();
        }
        else if (theme == Theme.MATERIAL) {
            new MaterialTextBox().render();
            new MaterialButton().render();
        }
    }
}
