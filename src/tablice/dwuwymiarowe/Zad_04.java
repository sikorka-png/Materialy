package tablice.dwuwymiarowe;

/**
 * Dana jest tablica kwadratowa o rozmiarze N x N na przykład:
 * char[][] arr = {
 * {'a', 'b', 'c'},
 * {'d', 'e', 'f'},
 * {'g', 'h', 'i'},
 * };
 * przy pomocy 2 pętli for i jednego operatora ternarnego (trójargumentowego) wypisz jej elementy idąc
 * zygzakiem góra-dół prawo dół-góra ..., w taki sposób aby dla przykładowej tablicy wynikiem było:
 *
 * a d g
 * h e b
 * c f i
 */
public class Zad_04 {
    public static void main(String[] args) {
        char[][] arr = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(
                        (i % 2) == 0 ? arr[j][i] : arr[arr.length - 1 - j][i]
                );
            }
            System.out.println();
        }
    }
}
