package pętle.fori;

import java.util.Scanner;

/**
 * Utwórz program, który dla podanego n utworzy klepsydrę złożoną z gwiazdek. Przykład dla n=4:
 * *******
 * .*****.
 * ..***..
 * ...*...
 * ..***..
 * .*****.
 * *******
 */
public class Zad_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < 2 * size + 1; i++) {
            for (int j = 0; j < 2 * size + 1; j++) {
                if ((j >= i && j <= 2 * size - i) || (j >= 2 * size - i && j <= i)) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }
}
