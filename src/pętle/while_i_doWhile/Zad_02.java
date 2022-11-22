package pętle.while_i_doWhile;

import java.util.Scanner;

/**
 * Zadanie 2
 * Wprowadź z klawiatury wartość liczbową i zainicjuj nią zmienną typu byte o nazwie wrt.
 * Następnie utwórz program, który wypisze na ekran wartości potęg dwójki lub wartości 0,
 * dla wszystkich bitów z których składa się ta liczba. Przykładowo dla liczby 5 oczekiwany jest ciąg wynikowy:
 * 0
 * 4
 * 0
 * 1
 */
public class Zad_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte wrt = in.nextByte();
        byte value = (byte) (0b01000000);
        for (int i = 0; i < 7; i++) {
            System.out.println(value & wrt);
            value = (byte) (value >> 1);
        }
    }
}
