package tablice.jednowymiarowe;

import java.util.Arrays;

/**
 * Dane są dwie tablice arr1 i arr2 wypełnione losowymi wartościami liczb całkowitych. Utwórz program, który:
 * -	utworzy nową tablicę zawierającą wszystkie elementy z obu tablic
 * -	utworzy nowa tablicę zawierająca elementy występujące w obu tablicach
 * -	utworzy nową tablicę, która pomieści wszystkie takie liczby całkowite
 * z przedziału pomiędzy elementem o najmniejszej a największej wartości z obu tablic,
 * które nie znajdują się w obu tablicach
 */
public class Zad_05 {
    public static void main(String[] args) {
        int [] arr1 = {1, 5, 3, 8, 10};
        int [] arr2 = {1, 3, 100, 19, 88, 10, -5};

        System.out.println("Punkt pierwszy");
        int[] allNumbers = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            allNumbers[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            allNumbers[arr1.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(allNumbers));

        System.out.println("Punkt drugi");
        int commonElementsSize = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[i]) {
                    commonElementsSize++;
                }
            }
        }
    }
}
