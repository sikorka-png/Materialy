package pętle.fori;

import java.util.Scanner;

/**
 * Zadanie 14
 * Napisz program pobierający od użytkownika wartości m i n,
 * który wypisze n liczb pierwszych, z przedziału [m, ∞).
 */
public class Zad_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe m: ");
        int m = scanner.nextInt();
        System.out.println("Podaj liczbe n: ");
        int n = scanner.nextInt();

        while (n > 0) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println("Liczba pierwsza: " + m);
                n--;
            }
            m = m + 1;
        }

    }
}
