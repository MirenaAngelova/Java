import java.util.Scanner;

public class _04_CalculateExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double pow = (a + b + c) / Math.sqrt(c);
        double f1 = Math.pow(((a * a + b * b) / (a * a - b * b)), pow);
        double f2 = Math.pow((a * a + b * b - Math.pow(c, 3)), a - b);

        double averageFirst = (a + b + c) / 3;
        double averageSecond = (f1 + f2) / 2;

        double difference = Math.abs(averageFirst - averageSecond);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, difference);
    }
}
