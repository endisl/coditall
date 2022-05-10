package ood.structure.d;

public class Editor {
    public void openProject(String path) {
        AbstractArtefact[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

       artefacts[0] = new MainDecorator(new ErrorDecorator(artefacts[0]));
       artefacts[2] = new ErrorDecorator(artefacts[2]);

        for (var artefact: artefacts)
            System.out.println(artefact.render());
    }
}
