import java.util.Scanner;

public class _05_ConvertFromDecimalSystemToBaseSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();
        int baseSeven = 7;

        System.out.println(Integer.toString(decimal, baseSeven));
    }
}
