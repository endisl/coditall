package ood.behavior.str.exercise;

public class DESEncryptor implements Encryptor {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting " + message + " using DES");
    }
}
