import java.util.Scanner;

public class _04_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] str = scan.nextLine().split(" ");

        Integer[] seq = new Integer[str.length];

        for (int i = 0; i < seq.length; i++) {

            seq[i] = Integer.parseInt(str[i]);
        }
        System.out.print(seq[0]);
        int count = 1;
        int maxLength = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 1; i < seq.length; i++) {

            if (seq[i] > seq[i - 1]) {
                System.out.print(" " + seq[i]);
                count++;
            }
            else {
                System.out.println();
                System.out.print(seq[i]);
                count = 1;
            }

            if (count > maxLength) {
                maxLength = count;
                index = i;
            }

        }
        System.out.println();
        //System.out.println(maxLength);
        //System.out.println(index);

        if (count == 1) {
            System.out.printf("Longest: %s", seq[0]);
        }
        else {
            System.out.print("Longest: ");
            for (int i = index - maxLength + 1; i < index + 1; i++) {
                System.out.printf("%s ", seq[i]);
            }
        }
    }
}
