import java.util.ArrayList;
import java.util.Scanner;

public class _08_OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        Integer[] oddEven = new Integer[list.size()];

        oddEven = list.toArray(oddEven);

        if (oddEven.length % 2 != 0) {
            System.out.println("Invalid length");
            return;
        }

        for (int i = 0; i < oddEven.length - 1; i += 2) {
            if (oddEven[i] % 2 == 0 && oddEven[i + 1] % 2 == 0) {
                System.out.printf("%d, %d -> both are even\n", oddEven[i], oddEven[i + 1]);
            }
            else if(oddEven[i] % 2 == 1 && oddEven[i + 1] % 2 == 1) {
                System.out.printf("%d, %d -> both are odd\n", oddEven[i], oddEven[i + 1]);
            }
            else if ((oddEven[i] % 2 == 0 && oddEven[i + 1] % 2 != 0) ||
            (oddEven[i] % 2 != 0 && oddEven[i + 1] % 2 == 0)){
                System.out.printf("%d, %d -> different\n", oddEven[i], oddEven[i + 1]);
            }
        }
    }
}
