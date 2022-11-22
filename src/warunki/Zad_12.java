package warunki;

import java.util.Scanner;

/**
 * Zadeklaruj i zainicjuj zmienne:
 * int x o wartości -13,
 * int y o wartości -13,
 * int z o wartości -4.
 * Zmienne te określają zakresy następujących zbiorów:
 * -A = (x,-10] ∪ (-5, 0) ∪ (5, 10)
 * -B = (−∞, y] ∪ (-8, 3]
 * -C = [z, ∞)
 * Napisz program weryfikujący, do których części należy zmienna wrt.
 *
 */
public class Zad_12 {
    public static void main(String[] args) {
        byte x = -13;
        short y = -13;
        int z = -4;

        Scanner in = new Scanner(System.in);

        int wrt = in.nextInt();
        if (wrt >= z) {
            System.out.println("Zbior C");
        }

        if (wrt <= y || (wrt > -8 && wrt <= -3)) {
            System.out.println("Zbior B");
        }

        if ((wrt > x && wrt <= -10) || (wrt > -5 && wrt < 0) || (wrt > 5 && wrt < 10)) {
            System.out.println("Zbior A");
        }
    }
}
