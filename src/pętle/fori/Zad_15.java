package pętle.fori;

import java.util.Scanner;

/**
 * Utwórz program, który dla podanego n (wierszy) utworzy choinkę złożoną z gwiazdek. Przykład dla n=4:
 *    *
 *   ***
 *  *****
 * *******
 * Zmodyfikuj program tak, aby choinka miała pień oraz by zawisły na niej bombki ($) w losowych miejscach.
 * Możesz przyjąć że na każde 10 gwiazdek w rzędzie przypada 1 bombka w losowym miejscu.
 * Przykład dla n=4:
 *    *
 *   *$*
 *  *$***
 * *****$*
 *    *
 */
public class Zad_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double randomValue;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j >= n - 1 - i && j <= n - 1 + i) {
                    randomValue = Math.random();
                    if (randomValue < 0.1) {
                        System.out.print("$");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
