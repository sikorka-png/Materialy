package tablice.jednowymiarowe;

/**
 * Zadeklaruj tablicę zmiennych typu char i wypełnij ją trzema dowolnymi znakami.
 * Następnie przeanalizuj tablicę i wskaż indeks elementu o najmniejszej wartości.
 */
public class Zad_02 {
    public static void main(String[] args) {
        char [] chars = {'A', 'Z', 'C'};

        if (chars[0] < chars[1] && chars[0] < chars[2]) {
            System.out.println(chars[0] + " indeks " + 0);
        } else if (chars[1] < chars[0] && chars[1] < chars[2]) {
            System.out.println(chars[1] + " indeks " + 1);
        } else {
            System.out.println(chars[2] + " indeks " + 2);
        }
    }
}
