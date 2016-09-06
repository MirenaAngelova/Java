import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Scanner;

/**
 *  Write a program that converts the decimal number system to the ghetto numeral system. In the ghetto,
 *  numbers are represented as following:
 ?	0 – Gee
 ?	1 – Bro
 ?	2 – Zuz
 ?	3 – Ma
 ?	4 – Duh
 ?	5  - Yo
 ?	6 – Dis
 ?	7 – Hood
 ?	8 – Jam
 ?	9 – Mack
 Input	Output
 6781	DisHoodJamBro
 9374	MackMaHoodDuh
 533	YoMaMa
 102	BroGeeZuz

 */
public class _07_GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String digits = scan.nextLine();
        String ghetto = "";

        for (char ch : digits.toCharArray()){
            switch (ch) {
                case '0':
                    ghetto += "Gee";
                    break;
                case '1':
                    ghetto += "Bro";
                    break;
                case '2':
                    ghetto += "Zuz";
                    break;
                case '3':
                    ghetto += "Ma";
                    break;
                case '4':
                    ghetto += "Duh";
                    break;
                case '5':
                    ghetto += "Yo";
                    break;
                case '6':
                    ghetto += "Dis";
                    break;
                case '7':
                    ghetto += "Hood";
                    break;
                case '8':
                    ghetto += "Jam";
                    break;
                case '9':
                    ghetto += "Mack";
                    break;

            }
        }
        System.out.print(ghetto);
    }
}
