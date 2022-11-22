package warunki;

import java.util.Scanner;

/**
 * Wczytaj dowolną wartość liczbową i sprawdź czy jest większa od 0 czy mniejsza. Wypisz komunikat odpowiedni komunikat.
 * Użyj instrukcji warunkowej if oraz operatora trójargumentowego (ternarnego), aby porównać obszerność obu rozwiązań.
 */
public class Zad_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        if (value == 0) {
            System.out.println("Liczba rowna 0");
        } else if (value > 0) {
            System.out.println("Liczba wieksza od 0");
        } else {
            System.out.println("Liczba mniejsza od 0");
        }

        System.out.println(
                value >= 0 ? value == 0 ? "Liczba rowna 0" : "Liczba wieksza od 0" : "Liczba mniejsza od 0"
        );
    }
}
