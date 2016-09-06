import java.util.Scanner;

public class _03_FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer a (0 <= a <= 500):");
        int a = scan.nextInt();

        System.out.println("Enter a floating-point b:");
        double b = scan.nextDouble();

        System.out.println("Enter a floating-point c:");
        double c = scan.nextDouble();

        String binary = Integer.toBinaryString(a).replace(' ', '0');
        System.out.printf("|%-10X|%s|%10.2f|%-10.3f", a, binary, b, c);
    }
}
