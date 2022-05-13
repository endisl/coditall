package ood.structure.fly;

public class Cell {
    private final int row;
    private final int column;
    private String content;
    private CellContext context;

    public Cell(int row, int column, CellContext context) {
        this.row = row;
        this.column = column;
        this.context = context;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setContext(CellContext context) {
        this.context = context;
    }

    public CellContext getContext() {
        return context;
    }

    public void render() {
        System.out.printf("(%d, %d): %s [%s] [%d]\n", row, column, content, context.getFontFamily(), context.getFontSize());
    }
}
