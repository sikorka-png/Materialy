package pętle.fori;

/**
 * Napisz program wyświetlający wartości od 1 do 10. Wykorzystaj w tym celu pętle.
 */
public class Zad_01 {
    public static void main(String[] args) {
        System.out.println("Pierwszy sposób");
        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }

        System.out.println("Drugi sposób");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
}
