import java.util.Scanner;

/**
 *
 * Input	Output
    12	    78
 Input	Output
    1	1
 Create a Java program that reads a number N from the console and calculates the sum of all numbers
 from 1 to N (inclusive).
 Input	Output
 5	    15

 */
public class _06_SumNumbersFromOneToN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
