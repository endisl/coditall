package ood.behavior.str.exercise;

public class AESEncryptor implements Encryptor {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting " + message + " using AES");
    }
}
