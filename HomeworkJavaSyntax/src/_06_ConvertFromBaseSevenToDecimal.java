
import java.util.Scanner;

public class _06_ConvertFromBaseSevenToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String baseSeven = scan.next();

        int decimal = Integer.parseInt(baseSeven, 7);

        System.out.print(decimal);
    }
}
