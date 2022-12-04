package tablice.jednowymiarowe;

/**
 * Napisz program, który definiuje dwie tablice intów, a następnie utworzy nową tablicę przechowującą sumy elementów na tych samych indeksach. W przypadku tablic o różnym rozmiarze należy przyjąć, że wartości elementów, które wychodzą poza zakres tablicy wynoszą 0.
 *
 * Na przykład dla tablic:
 * int[] arr = { 2, 3, 9 };
 * int[] brr = { 2, 3, 6, 5 };
 *
 * byłaby to tablica 4 elementowa: { 4, 6, 15, 5 }
 */
public class Zad_14 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9};
        int[] brr = {2, 3, 6, 5};
        int biggerArraySize = arr.length > brr.length ? arr.length : brr.length;
        int smallerArraySize = arr.length > brr.length ? brr.length : arr.length;
        int[] crr = new int[biggerArraySize];
        for (int i = 0; i < biggerArraySize; i++) {
            if (i < smallerArraySize) {
                crr[i] = arr[i] + brr[i];
            } else {
                if (arr.length > brr.length) {
                    crr[i] = arr[i];
                } else {
                    crr[i] = brr[i];
                }
            }
        }

        System.out.println("Rezultat");
        for (int i = 0; i < crr.length; i++) {
            System.out.print(crr[i] + " ");
        }
        System.out.println();
    }
}
