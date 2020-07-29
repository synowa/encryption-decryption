
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String date = scanner.next();
        char[] charsFromString = date.toCharArray();
        String year = String.format("%s%s%s%s", charsFromString[0], charsFromString[1],
                charsFromString[2], charsFromString[3]);
        String month = String.format("%s%s", charsFromString[5], charsFromString[6]);
        String day = String.format("%s%s", charsFromString[8], charsFromString[9]);

        System.out.format("%s/%s/%s", month, day, year);
//        String[] parts = date.split("-");
//        System.out.format("%s/%s/%s", parts[1], parts[2], parts[0]); //splitowanie na podanym Stringu

    }
}