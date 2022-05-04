package ood.creation.b.problem;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void export(PresentationFormat format) {
        if (format == PresentationFormat.PDF) {
            var pdf = new PdfDocument();
            pdf.addPage("Copyright");
            for (Slide slide : slides)
                pdf.addPage(slide.getText());
        }
        else if (format == PresentationFormat.MOVIE) {
            var movie = new Movie();
            movie.addFrame("Copyright", 5);
            for (Slide slide : slides)
                movie.addFrame(slide.getText(), 5);
        }
    }
}
