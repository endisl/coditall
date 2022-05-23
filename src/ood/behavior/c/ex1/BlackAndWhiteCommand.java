package ood.behavior.c.ex1;

import ood.behavior.c.ex1.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White");
    }
}
