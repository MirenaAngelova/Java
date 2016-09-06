
import java.util.Scanner;

public class _02_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] s = scan.nextLine().split(" ");

        System.out.print(s[0]);

        for (int i = 1; i < s.length; i++) {
            if (s[i].equals(s[i - 1])) {
                System.out.print(" " + s[i]);
            }
            else {
                System.out.println();
                System.out.print(s[i]);
            }
        }
    }
}

