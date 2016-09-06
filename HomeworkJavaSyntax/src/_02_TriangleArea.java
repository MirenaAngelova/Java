import java.util.Scanner;

public class _02_TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);

        int aX = scan.nextInt();
        int aY = scan.nextInt();
        int bX = scan.nextInt();
        int bY = scan.nextInt();
        int cX = scan.nextInt();
        int cY = scan.nextInt();

        double a = Math.abs(Math.sqrt((bY - aY) * (bY - aY) + (bX - aX) * (bX - aX)));
        double b = Math.abs(Math.sqrt((cY - bY) * (cY - bY) + (cX - bX) * (cX - bX)));
        double c = Math.abs(Math.sqrt((cY - aY) * (cY - aY) + (cX - aX) * (cX - aX)));

        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2.0;
            System.out.print(Math.round(Math.abs(Math.sqrt(p * (p - a) * (p - b) * (p - c)))));
        }
        else {
            System.out.print(0);
        }
    }
}
