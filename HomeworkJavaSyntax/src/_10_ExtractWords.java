import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _10_ExtractWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        Pattern pat = Pattern.compile("[A-Za-z]{2,}");

        Matcher match = pat.matcher(str);

        while (match.find()) {
            System.out.printf("%s ", match.group());
        }
    }
}
