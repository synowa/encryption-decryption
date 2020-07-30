package encryptdecrypt;

public class EncryptDecrypt {
    int key;

    public EncryptDecrypt(int key) {
        this.key = key;
    }

    public String encrypt(String message) {
        char[] encryptedMessage = new char[message.length()];
        for (int i = 0; i < message.length(); i++) {
            encryptedMessage[i] = (char) (message.charAt(i) + key);
        }
        return new String(encryptedMessage);
    }

    public String decrypt(String message) {
        char[] encryptedMessage = new char[message.length()];
        for (int i = 0; i < message.length(); i++) {
            encryptedMessage[i] = (char) (message.charAt(i) - key);
        }
        return new String(encryptedMessage);
    }
}
