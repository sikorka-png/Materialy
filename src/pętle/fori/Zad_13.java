package pętle.fori;

import java.util.Scanner;

/**
 * Napisz program, który sprawdzi czy wpisana przez użytkownika liczba jest liczbą pierwszą.
 */
public class Zad_13 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe do sprawdzenia ");
        int value = new Scanner(System.in).nextInt();
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                System.out.println("To nie jest liczba pierwsza");
                System.exit(0);
            }
        }
        System.out.println("To jest liczba pierwsza");
    }
}
