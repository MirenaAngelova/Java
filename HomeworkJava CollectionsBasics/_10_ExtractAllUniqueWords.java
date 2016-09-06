import java.awt.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _10_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine().toLowerCase();

        /*ArrayList<String> list = new ArrayList<>();
        ArrayList<String> exit = new ArrayList<>();*/

        HashSet<String> exit = new HashSet<>();

        Pattern pat = Pattern.compile("[a-z]+");

        Matcher match = pat.matcher(text);

        while (match.find()) {
            exit.add(match.group());
        }

        /*for (String s : list) {
            if(!exit.contains(s)) {
                exit.add(s);
            }
        }

        Collections.sort(exit);*/

        /*ArrayList list = new ArrayList<>(exit);
        Collections.sort(list);*/

        TreeSet<String> set = new TreeSet<>();
        set.addAll(exit);


        /*for (String s : exit) {
            System.out.print(s + " ");
        }*/

        for (String s : set) {
            System.out.print(s + " ");
        }
    }
}
