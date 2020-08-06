import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String word2;
        for (int i = 0; i < word.length(); i++) {
            word2 = "" + word.charAt(i) + word.charAt(i);
            System.out.print(word2);
        }
    }
}