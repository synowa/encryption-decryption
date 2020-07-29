import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();

        if (n > s.length()) {
            System.out.println(s);
        } else {
            String firstNCharacters = s.substring(0, n);
            String restCharacters = s.substring(n, s.length());
            System.out.format("%s%s", restCharacters, firstNCharacters);
        }
    }
}