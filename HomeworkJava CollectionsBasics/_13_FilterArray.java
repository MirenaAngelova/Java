import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _13_FilterArray {
    public static void main(String[] args) {
       /* Stream
                .of(new Scanner(System.in).nextLine().split(" "))
                .filter(s -> s.length() > 3)
                .forEach(e -> System.out.print(e + " "));*/

        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        List<String> items = new ArrayList<>();

        for (String word : words) {
            items.add(word);
        }

        items.stream().filter(item -> item.length() > 3)
                .forEach(item -> System.out.print(item + " "));
    }
}
