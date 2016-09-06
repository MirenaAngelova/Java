import java.util.Scanner;

public class _12_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1 = scan.next();
        String s2 = scan.next();

        int sum = 0;

        if (s2.length() > s1.length()) {
            String t = s1;
            s1 = s2;
            s2 = t;
        }

        if (s1.length() == s2.length()) {

            for (int i = 0; i < s1.length(); i++) {
                sum += s1.codePointAt(i) * s2.codePointAt(i);
            }
        }
        else {
            for (int i = 0; i < s2.length(); i++) {
                sum += s1.codePointAt(i) * s2.codePointAt(i);
            }

            for (int i = s2.length(); i < s1.length(); i++) {
                sum += s1.codePointAt(i);
            }
        }
        System.out.print(sum);
    }
}
