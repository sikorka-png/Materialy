package tablice.jednowymiarowe;

import java.util.Arrays;

/**
 * Mamy 2 posortowane tablice, utwórz program, który utworzy 3 tablice,
 * która pomieści wszystkie dane z obu tablic początkowych i nadal będzie posortowana. Dla danych wejściowych:
 * int[] arr1 = {1, 2, 6, 7};
 * int[] arr2 = {3, 4, 4, 4, 5}
 *
 * int[] arrResult = {1, 2, 3, 4, 4, 4, 5, 6, 7}
 * Nie używaj dodatkowych tablic pomocniczych oraz algorytmów do posortowania tablicy wynikowej.
 */
public class Zad_18 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 6, 7};
        System.out.println("Tablica pierwsza");
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {3, 4, 4, 4, 5};
        System.out.println("Tablica druga");
        System.out.println(Arrays.toString(arr2));

        int[] arrResult = new int[arr1.length + arr2.length];
        for (int i = 0, indexArr1 = 0, indexArr2 = 0; i < arr1.length + arr2.length; i++) {
            if (indexArr1 < arr1.length && indexArr2 < arr2.length) {
                if (arr1[indexArr1] < arr2[indexArr2]) {
                    arrResult[i] = arr1[indexArr1++];
                } else {
                    arrResult[i] = arr2[indexArr2++];
                }
            } else if (indexArr1 < arr1.length) {
                arrResult[i] = arr1[indexArr1++];
            } else {
                arrResult[i] = arr2[indexArr2++];
            }
        }
        System.out.println("Tablica wynikowa");
        System.out.println(Arrays.toString(arrResult));
    }
}
