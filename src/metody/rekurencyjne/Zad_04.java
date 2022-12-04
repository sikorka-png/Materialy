package metody.rekurencyjne;

import java.util.Scanner;

/**
 * Utwórz program, który wczyta z klawiatury wartość liczbową. Następnie zaimplementuj algorytm obliczania
 * silni o wprowadzonej podstawie. Zadanie zrealizuj zarówno w wersji rekurencyjnej jak i iteracyjnej.
 */
public class Zad_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        int silnia = silniaIteracyjnie(liczba);
        System.out.println("Silnia iteracyjnie = " + silnia);
        silnia = silniaRekurencyjnie(liczba);
        System.out.println("Silnia rekurencyjnie = " + silnia);
    }

    public static int silniaIteracyjnie(int n) {
        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static int silniaRekurencyjnie(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * silniaRekurencyjnie(n - 1);
        }
    }
}
