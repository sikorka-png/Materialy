package pętle.fori;

import java.util.Scanner;

/**
 * Zmodyfikuj powyższy program w taki sposób by wypisywał jedynie litery alfabetu dla zadanego przez Ciebie przedziału np.:
 * Użytkownik podając litery „B” oraz „F” powinien otrzymać na ekranie:
 * B, C, D, E, F
 */
public class Zad_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj litere poczatkowa: ");
        char startLetter = scanner.next().charAt(0);
        System.out.println("Podaj litere koncowa: ");
        char endtLetter = scanner.next().charAt(0);
        for (char letter = startLetter; letter <= endtLetter; letter++) {
            System.out.print(letter + " ");
        }
    }
}
