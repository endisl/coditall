package ood.structure.fly;

public class Demo {
  public static void main(String[] args) {
    var sheet = new SpreadSheet(new CellContextFactory());
    sheet.setContent(0, 0, "Hello");
    sheet.setContent(1, 0, "World");
    sheet.setSize(0, 0,15);
    sheet.setFontFamily(0, 0, "Arial");
    sheet.render();
  }
}
