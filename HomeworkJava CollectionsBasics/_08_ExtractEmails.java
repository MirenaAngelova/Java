/*Please contact us at: support@github.com. 	                                    support@github.com
Just send email to s.miller@mit.edu and j.hopking@york.ac.uk for more information. 	s.miller@mit.edu
                                                                                    j.hopking@york.ac.uk
Many users @ SoftUni confuse email addresses.
We @ Softuni.BG provide high-quality training @ home or @ class.
–- steve.parker@softuni.de.  	                                                    steve.parker@softuni.de
*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        Pattern pat =
                Pattern.compile("[a-z0-9]+([\\.\\-_])*([a-z0-9]+)*@[a-z]+(\\-[a-z]+)*(\\.[a-z]+)*(\\.[a-z]{2,})");

        Matcher match = pat.matcher(text);

        while (match.find()) {
            System.out.println(match.group());
        }
    }
}
