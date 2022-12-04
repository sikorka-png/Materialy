package tablice.jednowymiarowe;

/**
 * Napisz program, przyjmujący tablicę liczb naturalnych, napisz program znajdujący wartość minimalną oraz maksymalną w tej tablicy oraz ilość wystąpień w danej zmiennej.
 *
 * int [] a = {2,3,4,2,7,4,7,2};
 * powinien wydrukować:
 *
 * Array: [ 2 3 4 2 7 4 7 2 ]
 * Min = 2 ; 3 times
 * Max = 7 ; 2 times
 */
public class Zad_13 {public static void main(String[] args) {
    int[] a = {2, 3, 4, 2, 7, 4, 7, 2};
    int min = a[0], ileMin = 1;
    int max = a[0], ileMax = 1;
    for (int i = 1; i < a.length; i++) {
        if (a[i] == max) {
            ileMax++;
        }
        if (a[i] == min) {
            ileMin++;
        }
        if (a[i] > max) {
            max = a[i];
            ileMax = 1;
        }
        if (a[i] < min) {
            min = a[i];
            ileMin = 1;
        }
    }
    System.out.print("Array: [ ");
    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.print(']');
    System.out.println();
    System.out.println("Min = " + min + " ; " + ileMin + " times");
    System.out.println("Max = " + max + " ; " + ileMax + " times");
}
}
