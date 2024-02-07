package metody.rekurencyjne;

import java.util.Scanner;

/**
 * Utwórz iteracyjną metodę wyświetlającą wszystkie permutacje cyfr wprowadzonej z klawiatury liczby
 */
public class Zad_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź liczbę: ");
        String number = scanner.nextLine();
        generatePermutations(number.toCharArray(), 0);
    }

    public static void generatePermutations(char[] digits, int index) {
        if (index == digits.length - 1) {
            System.out.println(new String(digits));
        } else {
            for (int i = index; i < digits.length; i++) {
                swap(digits, index, i);
                generatePermutations(digits, index + 1);
                swap(digits, index, i);
            }
        }
    }

    private static void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }
}
