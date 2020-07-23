import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextInt();
        double x2 = scanner.nextInt();
        double y1 = scanner.nextInt();
        double y2 = scanner.nextInt();

        double a = (Math.abs(x1 - y1)) / (Math.abs(x2 - y2));

        if (x1 == y1 || x2 == y2 || a == 1) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}