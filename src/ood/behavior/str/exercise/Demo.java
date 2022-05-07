package ood.behavior.str.exercise;

public class Demo {
    public static void main(String[] args) {
        var chatClient = new ChatClient();
        chatClient.send("Yeah", new AESEncryptor());
    }
}
