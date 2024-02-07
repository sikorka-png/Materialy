package inne.kolekcje.mapy.zadanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 1) Napisz metode ktora pozwala dodawac do mapy kolejne wyrazy. Na koncu ma wyswietlic ile razy jaki element byl dodany
 * 2) napisz metode ktora przyjmuje Mape<Integer, String>, zamien wartosci ktorych klucze sa parzystych wartosci na słowo "parzyste"
 * 3) Napisz program, ktory symuluje dzialanie slownika polsko-angielskiego.
 * Przykładowy program:
 * Podaj slowko po Polsku: mama Slowko po Angielsku to mother.
 * Program dziala dopoki uzytkownik nie zrezygnuje
 * (cancel)
 * 4) W systemie przechowujemy nazwe klasy (szkolnej, np 1a, 2b) oraz listę osób
 * (same nazwiska jako Stringi) które uczeszczaja do klasy.
 *      1) Napisz metode ktora zwraca liste osob o najdluzszych nazwiskach z kazdej klasy
 *      2) Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas
 * 5) Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas
 */
public class Main {
    public Main() {
        System.out.println("X");
    }

    public void f() {
        super.toString();
    }

    public static void main(String[] args) {
//        char c = 'C', f = 'F';
//        char result = c + 4;
//        if (c % f != 0) {
//            System.out.println();
//        } else {
//            System.out.println(f - 2);
//        }
//        int a = 0;
//        for (a = 7; a > 0; a-=4) {
//            System.out.println(a * 2);
//            a += 2;
//        }
//
//        String path = "./plik.txt";
//        try {
//            Scanner scanner = new Scanner(new File(path));
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                String[] slowa = line.split(" ");
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        int i = 10;
        i = i++;
        System.out.println(i);
        i = ++i;
        System.out.println(i);
        i = i++ + ++i;
        System.out.println(i);

        new Main2();
    }
}

class Main2 extends Main {

}
