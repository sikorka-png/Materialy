package tablice.jednowymiarowe;

import java.util.Arrays;

/**
 * Utwórz i wypełnij losowymi wartościami dwie tablice o takim samym rozmiarze i typach odpowiednio int i double.
 * Przyjmij, że elementy na tym samym indeksie (w obu tablicach) są nierozerwalnie ze sobą połączone,
 * co oznacza, że wykonanie dowolnej operacji na elemencie pod indeksem X w jednej tablicy będzie wymagało takiej samej operacji w drugiej tablicy.
 * Sortuj te dane rosnąco, przyjmując jako kryterium sumę wartości na tym samym indeksie w obu tablicach.
 */
public class Zad_06 {
    public static void main(String[] args) {
        int [] intArray = new int[10];
        double [] doubleArray = new double[10];
        for(int i = 0; i < 10; i++){
            intArray[i] = (int)(Math.random() * 20);
            doubleArray[i] = (Math.random() * 20);
        }

        System.out.println("Przed posortowaniem");
        System.out.println("int");
        System.out.println(Arrays.toString(intArray));
        System.out.println("double");
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("Sumarycznie");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Indeks " + i + " wartosc " + (intArray[i] + doubleArray[i]));
        }

        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] + doubleArray[j] > intArray[j + 1] + doubleArray[j + 1]) {
                    int tmp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tmp;

                    double tmp2 = doubleArray[j];
                    doubleArray[j] = doubleArray[j + 1];
                    doubleArray[j + 1] = tmp2;
                }
            }
        }

        System.out.println("Po sortowaniu");
        System.out.println("int");
        System.out.println(Arrays.toString(intArray));
        System.out.println("double");
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("Sumarycznie");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Indeks " + i + " wartosc " + (intArray[i] + doubleArray[i]));
        }
    }
}
