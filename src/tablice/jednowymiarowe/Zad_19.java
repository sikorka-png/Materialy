package tablice.jednowymiarowe;

import java.util.Scanner;

/**
 * Napisz program, który wczyta od użytkownika 2 liczby N i M, a następnie utworzy tablicę charów
 * o rozmiarze N i wypełni elementami podanymi również przez użytkownika. W taki sposób użytkownik będzie mógł wprowadzić dowolny wyraz N znakowy.
 * Wyraz ten zaszyfruj szyfrem cezara o przesunięciu M.
 * Wypisz zakodowany wyraz.
 */
public class Zad_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] array = new char [n];
        int m = in.nextInt();
        for(int i = 0; i < n ; i++){
            array[i] = in.next().charAt(0);
            array[i] += m;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
