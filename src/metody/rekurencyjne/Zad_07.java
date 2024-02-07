package metody.rekurencyjne;
import java.util.Scanner;

/**
 * Utwórz i przetestuj metodę rekurencyjną, która stwierdzi czy dostarczone w tablicy zmiennych typu char słowo jest palindromem.
 */
public class Zad_07 {
    public static void main(String[] args) {
        char[] slowo = {'k', 'a', 'j', 'a', 'k'};
        boolean czyPalindrom = palindromRekurencyjnie(slowo, 0, slowo.length - 1);
        System.out.println(czyPalindrom);
    }

    public static boolean palindromRekurencyjnie(char[] tab, int poczatek, int koniec) {
        if (tab[poczatek] != tab[koniec]) {
            return false;
        }
        poczatek++;
        koniec--;
        if (koniec > 0) {
            return palindromRekurencyjnie(tab, poczatek, koniec);
        }
        return true;
    }
}
