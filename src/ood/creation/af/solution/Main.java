package ood.creation.af.solution;

import ood.creation.af.solution.ant.AntWidgetFactory;
import ood.creation.af.solution.app.ContactForm;
import ood.creation.af.solution.material.MaterialWidgetFactory;

public class Main {

    public static void main(String[] args) {
        new ContactForm().render(new MaterialWidgetFactory());
        System.out.println();
        new ContactForm().render(new AntWidgetFactory());
    }
}
