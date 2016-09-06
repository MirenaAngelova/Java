import java.util.ArrayList;
import java.util.Scanner;

public class _09_CombineListsOfLetters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       /* String l1 = scan.nextLine();
        String[] hello = l1.split("");

        String l2 = scan.nextLine();
        String[] low = l2.split("");

        if (low.length != -1) {
            for (int i = 0; i < hello.length; i++) {
                for (int j = 0; j < low.length; j++) {
                    if (hello[i].equals(low[j])) {
                        low[j] = "";

                    }
                }
            }
        }
        for (String s : hello) {
            System.out.printf("%s", s);
        }
        for (String s : low) {
            if (s.equals("")) {
                continue;
            }
            System.out.printf(" %s", s);
        }
*/
        char[] hello = scan.nextLine().toCharArray();
        char[] low = scan.nextLine().toCharArray();

        ArrayList<Character> hellow = new ArrayList<>();

        for (int i = 0; i < hello.length; i++) {
            hellow.add(hello[i]);
        }

       /* for (int i = 0; i < hellow.size(); i++) {

            System.out.printf("%s", hellow.get(i));
        }*/

        for (int i = 0; i < hello.length; i++) {

            for (int j = 0; j < low.length; j++) {

                if (hello[i] == low[j]) {
                   low[j] = '$';
                }
            }
        }


        for (int i = 0; i < low.length; i++) {

            if (low[i] != '$') {

                hellow.add(' ');
                hellow.add(low[i]);
            }
        }

        for (int i = 0; i < hellow.size(); i++) {

            System.out.printf("%s", hellow.get(i));
        }
    }
}
