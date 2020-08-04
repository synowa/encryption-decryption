import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            } else if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}