import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _11_MostFrequentWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine().toLowerCase();

        ArrayList<String> list = new ArrayList<>();
        TreeMap<String, Integer> tm = new TreeMap<>();

        Pattern pat = Pattern.compile("[a-z]+");

        Matcher match = pat.matcher(text);

        while(match.find()) {
            list.add(match.group());
        }


        for (String s : list) {
            String word = s;
            Integer times = 1;
            if (!tm.containsKey(word)) {
                tm.put(word, times);
            }
            else {
                Integer oldValue = tm.get(word);
                tm.put(word, oldValue + times);
            }
        }

        int maxValue = (Collections.max(tm.values()));
        for (Map.Entry<String, Integer> entry : tm.entrySet()) {
            if (entry.getValue() == maxValue) {
                System.out.print(entry.getKey() + " -> ");
                System.out.println(entry.getValue() + " times");
            }
        }
    }
}
