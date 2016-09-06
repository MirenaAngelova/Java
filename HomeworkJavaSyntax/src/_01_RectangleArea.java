import java.util.Scanner;

public class _01_RectangleArea {

    public static void main(String[] args) {

        System.out.printf("Enter the sides of a rectangle:");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long area = a*b;

        System.out.printf("area = a * b = %2$d * %3$d = %1$d", area, a, b);

    }
}