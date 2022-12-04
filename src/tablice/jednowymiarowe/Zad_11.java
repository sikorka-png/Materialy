package tablice.jednowymiarowe;

import java.util.Scanner;

/**
 * Użytkownik wprowadza wartość zmiennej size, która będzie większa od 5. Na podstawie tej zmiennej utwórz tablicę, która przechowa ilość elementów równą size.
 * Następnie napisz program sprawdzający czy w podanej tablicy nie występuje jakieś 3 literowe słowo np. „kot”.
 */
public class Zad_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        char[] tab = new char [size];
        for (int i = 0; i < size; i++) {
            tab[i] = in.next().charAt(0);
        }
        char firstLetter = 'k', secondLetter = 'o', thirdLetter = 't';
        for(int i = 0; i < size; i++){
            if (tab[i] == firstLetter) {
                if (tab[i + 1] == secondLetter && tab[i + 2] == thirdLetter) {
                    System.out.println("Słowo występuje!");
                }
            }
        }
    }
}
