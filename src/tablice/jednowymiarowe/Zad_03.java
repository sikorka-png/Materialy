package tablice.jednowymiarowe;

import java.util.Scanner;

/**
 * Utwórz program, który utworzy pięcioelementową tablicę i wypełni ją losowymi literałami z przedziału od A do Z.
 * Następnie wprowadź z klawiatury wartość zmiennej char.
 * Program zlicza ile razy wystąpił wprowadzony z klawiatury znak,
 * wypisze na ekranie ilość wystąpień i zastąpi każde wystąpienie wartością 0.
 * Program powinien zakończyć się, gdy tablica jest wypełniona samymi zerami.
 */
public class Zad_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = new char[5];
        for (int i = 0; i < 5; i++) {
            chars[i] = (char) (Math.random() * (90 - 65 + 1) + 65);
        }

        int leftChars = 5;
        int numberOfOccurrences;
        while (leftChars > 0) {
            numberOfOccurrences = 0;
            char c = scanner.next().charAt(0);
            for (int i = 0; i < 5; i++) {
                if (chars[i] == c) {
                    leftChars--;
                    chars[i] = 0;
                    numberOfOccurrences++;
                }
            }
            System.out.println("Znak: " + c + " wystąpił: " + numberOfOccurrences + " razy");
        }
    }
}
