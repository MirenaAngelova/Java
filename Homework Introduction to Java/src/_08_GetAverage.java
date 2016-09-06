import java.util.Scanner;

/**
 *
 * Create a method that finds the average of three numbers. Read in internet about java methods.
 * Check the naming conventions. Invoke your method and test it. Format the output to two digits after the decimal
 * separator. The placeholder is %.2f
 a	    b	    c	    Average
 1.5	2.5	    3.8	    2.60
 12	    13	    25	    16.67
 0.005	0.5	    0.55	0.35
 0	    0	    2	    0.67

 */
public class _08_GetAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double average = (a + b + c) / 3.0;

        System.out.printf("%.2f", average);
    }
}
