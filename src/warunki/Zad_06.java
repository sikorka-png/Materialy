package warunki;

import java.util.Scanner;

/**
 * Wykonaj to samo co w poprzednim zadaniu, tym razem jednak sprawdzaj wylosowaną liczbę.
 * Operację losowania i sprawdzania powtórz 3 razy.
 */
public class Zad_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        for (int i = 0; i < 3; i++) {
            int value = (int) (Math.random() * (100 - 1 + 1) + 1);
            if (x > y) {
                System.out.println("Nieprawidlowy przedzial");
                System.exit(0);
            }
            if (value >= x && value <= y) {
                System.out.println("Liczba znajduje sie w przedziale");
            } else {
                System.out.println("Liczb spoza przedzialu");
            }
        }
    }
}
