import java.util.ArrayList;
import java.util.Scanner;

public class _14_SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] str = scan.nextLine().split(" ");
        String order = scan.nextLine();
        ArrayList<Integer> seq = new ArrayList<>();

        for (String s : str) {
            seq.add(Integer.parseInt(s));
        }

        if (order.equals("Ascending")) {
            seq
                    .stream()
                    .sorted()
                    .forEach(s -> System.out.print(s + " "));
        }
        else {
            seq
                    .stream()
                    .sorted((s1, s2) -> s2.compareTo(s1))
                    .forEach(s -> System.out.print(s + " "));
        }
    }
}
