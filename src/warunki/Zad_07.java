package warunki;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Stwórz grę, w której losowana jest liczba całkowita z zakresu [0; 100].
 * Użytkownik bez wiedzy o liczbie wylosowanej próbuje odgadnąć jaka to. Wykonując sprawdzenie dopóki gracz nie zgadnie,
 * informuj go czy wpisana przez niego liczba była większa czy mniejsza od wylosowanej.
 * Możesz dodać utrudnienie w postaci ograniczonej liczby prób odgadnięcia.
 */
public class Zad_07 {
    public static void main(String[] args) {
        int randomInt = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        int guessedValue;
        do {
            Scanner in = new Scanner(System.in);
            guessedValue = in.nextInt();
            if (randomInt > guessedValue) {
                System.out.println("Za malo!");
            } else if (randomInt < guessedValue) {
                System.out.println("Za duzo!");
            } else {
                System.out.println("Brawo! Zgadles!");
            }
        } while (randomInt != guessedValue);
    }
}
