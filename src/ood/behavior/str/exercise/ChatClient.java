package ood.behavior.str.exercise;

public class ChatClient {
    public void send(String message, Encryptor encryptor) {
        encryptor.encrypt(message);
    }
}
