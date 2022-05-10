package ood.structure.d;

public class ErrorDecorator implements AbstractArtefact {
    private AbstractArtefact artefact;

    public ErrorDecorator(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return String.format("%s %s", artefact.render(), "[Error]");
    }
}
