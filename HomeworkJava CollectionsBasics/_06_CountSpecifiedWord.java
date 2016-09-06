import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine().toLowerCase();
        String word = scan.nextLine().toLowerCase();


        Pattern pat = Pattern.compile(word + "[^A-Za-z]");

        Matcher match = pat.matcher(text);

        int count = 0;

        while (match.find()) {
            count++;
        }
        System.out.println(count);
    }
}
