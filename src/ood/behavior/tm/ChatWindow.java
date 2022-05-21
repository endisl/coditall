package ood.behavior.tm;

public class ChatWindow extends Window {

    @Override
    protected void beforeClose() {
        System.out.println("Before closing the chat window");
    }

    @Override
    protected void afterClose() {
        System.out.println("After closing the chat window");
    }
}
