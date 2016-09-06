import java.util.Scanner;

public class _14_MagicExchangeableWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] s = scan.nextLine().split(" ");

        String[] s1 = s[0].split("");
       /* for (int i = 0; i < s1.length; i++) {
            System.out.printf("%s", s1[i]);
        }
        System.out.println();*/
        String[] s2 = s[1].split("");
       /* for (int i = 0; i < s2.length; i++) {
            System.out.printf("%s", s2[i]);
        }
        System.out.println();*/
        boolean isE = true;

        for (int i = 0; i < s1.length; i++) {
            int newI = i;
            while (newI < s1.length - 1) {
                if (s1[i].equals(s1[newI + 1])) {

                    if (!(s2[i].equals(s2[newI + 1]))) {
                        isE = false;
                    }
                }
                newI++;
            }
        }
        System.out.print(isE);
    }
}
