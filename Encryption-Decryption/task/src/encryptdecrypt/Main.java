package encryptdecrypt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        int key = scanner.nextInt();

        char[] charsFromMessage = message.toCharArray();
        for (char c : charsFromMessage) {
            if (c >= 'a' && c <= 'z') {
                if (c + key <= 122) {
                    c = (char) (c + key);
                } else {
                    c = (char) (c + key - 26);
                }
            }
            System.out.print(c);
        }
    }
}