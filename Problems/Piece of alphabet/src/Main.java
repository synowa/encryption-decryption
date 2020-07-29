import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        boolean contains = alphabet.contains(word);
        System.out.println(contains);
    }
}