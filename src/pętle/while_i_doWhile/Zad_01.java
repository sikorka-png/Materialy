package pętle.while_i_doWhile;

/**
 * Przedstaw program ilustrujący podstawową różnicę pomiędzy pętlami while i do while.
 */
public class Zad_01 {
    public static void main(String[] args) {
        boolean bool = false;

        System.out.println("Petla while");
        while (bool) {
            System.out.println("Jestem w srodku petli while " + bool);
        }

        System.out.println("Petla do while");
        do {
            System.out.println("Jestem w srodku petli do while " + bool);
        }
        while (bool);
    }
}
