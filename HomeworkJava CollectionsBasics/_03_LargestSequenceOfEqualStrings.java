
import java.util.Scanner;

public class _03_LargestSequenceOfEqualStrings {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] s = scan.nextLine().split(" ");

        int maxLength = Integer.MIN_VALUE;
        int index = 0;
        int count = 1;

        for (int i = 0; i < s.length - 1; i++) {

            if (s[i].equals(s[i + 1])) {
                count++;
            }
            else {
                count = 1;
            }
            if (count > maxLength) {
                maxLength = count;
                index = i + 1;
            }
        }
        if (maxLength == 1) {
            System.out.println(s[0]);
        }
        else if (s.length == 1) {
            System.out.printf("%s", s);
        }
        else {
            for (int i = index - maxLength + 1; i <= index; i++) {
                System.out.print(s[i] + " ");
            }
        }
    }
}
