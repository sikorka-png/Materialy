package warunki;

import java.util.Scanner;

/**
 * Na podstawie wartości wprowadzonych od użytkownika X i Y sprawdź czy liczba 98 zawiera się w przedziale [X; Y]
 * pamiętaj, aby sprawdzić również czy przedział jest poprawny (X <= Y).
 */
public class Zad_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = 98;
        int x = in.nextInt();
        int y = in.nextInt();
        if (x > y) {
            System.out.println("Nieprawidlowy przedzial");
            System.exit(0);
        }
        if (value >= x && value <= y) {
            System.out.println("Liczba znajduje sie w przedziale");
        } else {
            System.out.println("Liczb spoza przedzialu");
        }
    }
}
