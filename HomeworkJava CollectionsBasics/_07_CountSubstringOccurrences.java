import com.sun.deploy.util.StringUtils;

import java.text.StringCharacterIterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _07_CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine().toLowerCase();
        String substring = scan.nextLine().toLowerCase();

        int fromIndex = 0;
        int count = 0;

        while (fromIndex != -1) {

            fromIndex = text.indexOf(substring, fromIndex);

            if (fromIndex != -1) {
                count++;
                fromIndex++;
            }
        }
        System.out.println(count);
    }
}
