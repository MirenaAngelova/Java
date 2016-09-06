import java.util.Scanner;

public class _13_GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] s1 = scan.nextLine().split(" ");
        String[] s2 = scan.nextLine().split(" ");

        Integer[] i1 = new Integer[s1.length];

        for (int i = 0; i < i1.length; i++) {
            i1[i] = Integer.parseInt(s1[i]);
        }
        int len = Math.min(Integer.parseInt(s2[1]), i1.length);

        if (s2[2].equals("odd")) {

            for (int i = 0; i < len; i++) {

                if (i1[i] % 2 != 0) {
                    System.out.printf("%d ", i1[i]);
                }
            }
        }
        if (s2[2].equals("even")) {

            for (int i = 0; i < len; i++) {

                if (i1[i] % 2 == 0) {
                    System.out.printf("%d ", i1[i]);
                }
            }
        }
    }
}
