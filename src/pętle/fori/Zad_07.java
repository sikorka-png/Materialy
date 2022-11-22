package pętle.fori;

import java.util.Scanner;

/**
 * Utwórz program, który wczyta wartość „size” i wyświetli na ekranie poniższy znak o rozmiarze size x size:
 * . . . . *
 * . . . * *
 * . . * * *
 * . * * * *
 */
public class Zad_07 {
    public static void main(String[] args) {
        System.out.println("Podaj wartosc size ");
        int size = new Scanner(System.in).nextInt();

        for (int i = 1; i <= size; i++) {
            boolean writeStar = false;
            for (int j = 0; j < size; j++) {
                if (!(size - i > j)) {
                    writeStar = true;
                }
                System.out.print(writeStar ? "*" : ".");
            }
            System.out.println();
        }
    }
}
