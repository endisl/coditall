package ood.behavior.c.ex1;

import ood.behavior.c.ex1.editor.BoldCommand;
import ood.behavior.c.ex1.editor.History;
import ood.behavior.c.ex1.editor.HtmlDocument;
import ood.behavior.c.ex1.fx.Button;

public class Main {
    public static void main(String[] args) {
        /*var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();*/

        /*var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
        composite.execute();*/

        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hi");
        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());
        boldCommand.unexecute();
        System.out.println(document.getContent());

    }
}
