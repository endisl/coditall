package ood.structure.fly;

import java.util.Objects;

public class CellContext {
    private final String fontFamily;
    private final int fontSize;
    private final boolean isBold;

    public CellContext(String fontFamily, int fontSize, boolean isBold) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.isBold = isBold;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public boolean isBold() {
        return isBold;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fontFamily, fontSize, isBold);
    }
}
