package tablice.jednowymiarowe;

/**
 * Napisz program, który odwróci wartości tablicy znakowej poprzez modyfikacje tablicy startowej.
 * Nie używaj dodatkowych tablic pomocniczych.
 */
public class Zad_12 {
    public static void main(String[] args) {
        char[] array = {'k', 'o', 't'};
        char tmp;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = tmp;
        }
        System.out.println("Rezultat");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
