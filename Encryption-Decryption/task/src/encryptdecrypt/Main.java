package encryptdecrypt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String targetOperation = scanner.nextLine();
        String message = scanner.nextLine();
        int key = scanner.nextInt();
        EncryptDecrypt encryptDecrypt = new EncryptDecrypt(key);

        if ("enc".equals(targetOperation)) {
            System.out.println(encryptDecrypt.encrypt(message));
        } else if ("dec".equals(targetOperation)) {
            System.out.println(encryptDecrypt.decrypt(message));
        }
    }
}