import java.util.Random;
import java.util.Scanner;

public class _07_RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        for (int i = n; i <= m; i++) {
            Random rn = new Random();
            int integer = rn.nextInt(m - n + 1);
            integer += n;
            System.out.printf(String.format("%d ", integer));
        }

    }
}
