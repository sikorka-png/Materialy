package inne.kolekcje.listy.zadanie;

import java.util.ArrayList;
import java.util.List;

/**
 * 1) Zadeklaruj ArrayListe intow, dodaj do niej 5 roznych liczb metoda add, wyswietl cala liste petla for each.
 * 2) Stworz metode ktora zwroci sume liczb z ArrayListy z 1 zadania
 * 3) Stworz metode ktora zwroci liste elementow wiekszych od 3
 * 4) Zadeklaruj Liste Stringow, dodaj do niej inne.kolekcje imion Tomek Ania Tomek Krzys Grzes Tomek metoda addAll, nastepnie usun wszystkich Tomkow z tej inne.kolekcje.listy
 * 5) Napisz metode do zadania 4, ktora zwroci najdluzsze imie
 * 6) Napisz metode do zadani 4 ktora sprawdza czy podane imie znajduje sie w kolekcji
 * 7) Zadeklaruj Liste zmiennych typu double, dodaj do inne.kolekcje.listy 5 liczb rzeczywiste i wypisz je w kolejnosci rosnacej
 * 8) Napisz metode ktora uzupelnia losowa iloscia (od 2-8) liczb losowych z przedziaku 1-10, rzucmy te liczby do nowej inne.kolekcje.listy posortujmy ja odwrotnie i zwracamy ta liste
 * 9) Napisz metode ktora jako parametr przyjmuje liste intow oraz inta i zwraca liste intow ktore sa wieksze niz podany jako parametr int
 * 10) Wyswietl ile razy było podane imie podane jako parametr
 * 11) Napisz metode ktora jako parametr przyjmuje Liste Stringow oraz znak. Zwroc:
 * 	- liste zawierajaca wszystkie Stringi ktore zawieraja podana znak
 * 	- Lista: Ania Kasia Grzegorz Tomek Magda a znak to a, to lista zwracana powinna zawierac Ania Kasia Magda
 * 12) Napisz metode ktora jako parametr przyjmuje 2 Listy Stringow i zwraca liste elementów ktore sa na obu listach
 * 13) Napisz metode ktora dla inne.kolekcje.listy intów zwroci roznice pomiedzy jej najwiekszym, a najmniejszym elementem
 * 14) Napisz metode ktora przyjmuje liste Stringow i zwraca listę (intow) indeksow wszystkich elementow na liscie, ktore sa takie same jak parametr metody,
 *     np dla Listy Ania Krzys Ania Piotr Tomek Ania i imienia Ania: output: to 0,2,5
 * 15) Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr
 * 16) Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr metoda ma odwrocic liste, nie ma nic zwracac, nie mozna wykorzystywac innych list/tablic
 * 17) Napisz metoda ktora sortuje inne.kolekcje malejaco
 * 18) majac liste intow zwróc liste intow tych ktore te ktore koncza sie na cyfre podana jako porametr
 * 19) Wyświetl ile razy ktorekolwiek imie zostało powtórzone. Np dla imion ania piotr ania tomek krzys tomek ania program powinien wypisac 3, bo byly 3 potworki
 * 20) Wyswietl ile razy we wszystkich imionach była użyta samogłoska
 * 21) Napisz metodę która wyswietli unikalne imiona
 * 22) Zwroc liste imion które sa dluzsze niz 5 znakow o parzystej dlugosci
 * 23) Zwroc liczbe słow ktore sa zlozone z samych whitespaców np spacji
 * 24) Napisz metode ktora przyjmuje jako parametr liste Stringow oraz liste intow (tej samej dlugosci obie inne.kolekcje.listy)
 * 	   Metoda ma zwrocic liste Stringow z pirwszej inne.kolekcje.listy ktorych dlugosc odpowiada liczbom na 2 liscie
 * 	   Ania Krzys Tomek Kasia Jan
 * 	   4 2 5 8 3
 * 	   Ania Tomek Jan
 * 25) Napisz metode ktora przyjmuje jako parametr liste tablic Stringow i oblicza sume dlugosci wszystkich Stringów
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> toRemove = new ArrayList<>();
        for (Integer i: list) {
            if (i < 3) {
                toRemove.add(i);
            }
        }
        for (Integer i: toRemove) {
            list.remove(i);
        }
    }

}
