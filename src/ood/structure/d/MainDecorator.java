package ood.structure.d;

public class MainDecorator implements AbstractArtefact {
    private AbstractArtefact artefact;

    public MainDecorator(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return String.format("%s %s", artefact.render(), "[Main]");
    }
}
