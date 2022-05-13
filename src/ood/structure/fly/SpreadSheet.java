package ood.structure.fly;

public class SpreadSheet {
  private final int MAX_ROWS = 3;
  private final int MAX_COLS = 3;
  private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];
  private CellContextFactory contextFactory;

  public SpreadSheet(CellContextFactory contextFactory) {
    this.contextFactory = contextFactory;
    generateCells();
  }

  public void setContent(int row, int col, String content) {
    ensureCellExists(row, col);

    cells[row][col].setContent(content);
  }

  public void setFontFamily(int row, int col, String fontFamily) {
    ensureCellExists(row, col);

    var cell = cells[row][col];
    var currentContext = cell.getContext();
    var context = contextFactory.getContext(fontFamily, currentContext.getFontSize(), currentContext.isBold());
    cells[row][col].setContext(context);
  }

  //added
  public void setSize(int row, int col, int fontSize) {
    ensureCellExists(row, col);

    var cell = cells[row][col];
    var currentContext = cell.getContext();
    var context = contextFactory.getContext(currentContext.getFontFamily(), fontSize, currentContext.isBold());
    cells[row][col].setContext(context);
  }

  private void ensureCellExists(int row, int col) {
    if (row < 0 || row >= MAX_ROWS)
      throw new IllegalArgumentException();

    if (col < 0 || col >= MAX_COLS)
      throw new IllegalArgumentException();
  }

  private void generateCells() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++) {
        cells[row][col] = new Cell(row, col, getDefaultContext());
      }
  }

  //improved
  private CellContext getDefaultContext() {
    //with this implementation only one CellContext object is created as the default context for each cell
    return contextFactory.getContext("Times New Roman", 12, false);
  }

  public void render() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++)
        cells[row][col].render();
  }
}
