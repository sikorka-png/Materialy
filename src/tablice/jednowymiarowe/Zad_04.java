package tablice.jednowymiarowe;

/**
 * Utwórz jednowymiarową tablicę zmiennych int o losowo wybranym rozmiarze pomiędzy 10 a 15.
 * Następnie wykonaj kroki:
 * -	wypełnij jej elementy kolejnymi wartościami poczynając od 0, np. {0, 1, 2, 3, 4, 5}
 * -	wymieszaj wszytskie elementy w tej tablicym np. rezultatem mogłoby być {5, 2, 3, 1, 4, 0}
 * -	zwizualizuj rezultat tak, aby przedstawiał mapę permutacji, tak jak poniżej
 * -	2 0 1 4 3
 *      . * . . .
 *      . . * . .
 *      * . . . .
 *      . . . . *
 *      . . . * .
 */
public class Zad_04 {
    public static void main(String[] args) {
        int[] array = new int[(int) (Math.random() * (15 - 10 + 1) + 10)];

        System.out.println("Punkt pierwszy");
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println("Index (" + i + ") wartosc " + array[i]);
        }

        System.out.println("Punkt drugi (po przemieszaniu)");
        int index1, index2, tmp;
        for (int i = 0; i < array.length; i++) {
            index1 = (int) (Math.random() * (array.length));
            index2 = (int) (Math.random() * (array.length));
            tmp = array[index1];
            array[index1] = array[index2];
            array[index2] = tmp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index (" + i + ") wartosc " + array[i]);
        }

        System.out.println("Punkt trzeci");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == i) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
