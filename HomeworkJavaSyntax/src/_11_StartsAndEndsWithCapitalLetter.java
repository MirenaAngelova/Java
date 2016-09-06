
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _11_StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        Pattern pat = Pattern.compile("\\b[A-Z][A-Za-z]*[A-Z]\\b");

        Matcher match = pat.matcher(str);

        while (match.find()) {

            System.out.printf("%s ", match.group());
        }
    }
}
