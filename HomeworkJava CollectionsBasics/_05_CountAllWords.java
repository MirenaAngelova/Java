import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _05_CountAllWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        Pattern pat = Pattern.compile("\\w+");

        Matcher match = pat.matcher(text);

        int count = 0;
        while (match.find()) {
            count++;
        }
        System.out.println(count);
    }
}
