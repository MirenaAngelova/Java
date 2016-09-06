import java.util.*;

public class _12_CardsFrequencies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cards = scan.nextLine().split(" ");//.split("[???? ]+")
        double n = cards.length;

        LinkedHashMap<String, Double> lhm = new LinkedHashMap<>();

        for (String s : cards) {
            String card = s;
            String face = card.substring(0, card.length() - 1);
            Double faceValue = 1.0;
            if (!lhm.containsKey(face)) {
                lhm.put(face,faceValue);
            }
            else {
                Double newFaceValue = lhm.get(face);
                lhm.put(face, faceValue + newFaceValue);
            }
        }
        for (String entry : lhm.keySet()) {
            System.out.printf("%s -> %.2f%%\n", entry, (lhm.get(entry) / n) * 100.0);
        }
    }
}
