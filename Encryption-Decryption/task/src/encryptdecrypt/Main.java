package encryptdecrypt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String targetOperation = scanner.nextLine();
        String message = scanner.nextLine();
        int key = scanner.nextInt();

        char[] charsFromMessage = message.toCharArray();
        if ("enc".equals(targetOperation)) {
            for (char c : charsFromMessage) {
//                if (c + key <= 122) {
                    c = (char) (c + key);
//                } else {
//                    c = (char) (c + key - 26);
//                }
                System.out.print(c);
            }
        } else if ("dec".equals(targetOperation)) {
            for (char c : charsFromMessage) {
                if (c - key <= 122) {
                    c = (char) (c - key);
                } else {
                    c = (char) (c - key + 26);
                }
                System.out.print(c);
            }
        }
    }
}