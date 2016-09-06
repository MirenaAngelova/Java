/**
 * a b c d e f g h i j k l m n o p q r s t u v w x y z
 */
public class _04_PrintCharacters {
    public static void main(String[] args) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(String.format("%c ", ch));
        }
    }
}
