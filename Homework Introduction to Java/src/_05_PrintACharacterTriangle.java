import java.util.Scanner;

/**
 *
 * 5	a
        a b
        a b c
        a b c d
        a b c d e
        a b c d
        a b c
        a b
        a
 */
public class _05_PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int counter = n;

        for (int i = 0; i < 2 * n - 1; i++) {
            char ch = 'a';

            for (int j = 0; j <= n - counter; j++) {

                    System.out.printf(String.format("%c ", ch));

                    if (ch == 'z') {
                        ch = 'a';
                    }
                    else {
                        ch++;
                    }

            }
            if (i < n - 1) {
                counter--;
            }
            else {
                counter++;
            }
            System.out.println();
        }
    }
}
