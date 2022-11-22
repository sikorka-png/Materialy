package inne.kolekcje.listy.odpowiedz;

import java.util.*;

public class Main {


//	1) Zadeklaruj ArrayListe intow, dodaj do niej 5 roznych liczb metoda add, wyswietl cala liste petla for each. 
//	2) Stworz metode ktora zwroci sume liczb z ArrayListy z 1 zadania
//	3) Stworz metode ktora zwroci liste elementow wiekszych od 3
//	4) Zadeklaruj Liste Stringow, dodaj do niej inne.kolekcje imion Tomek Ania Tomek Krzys Grzes Tomek metoda addAll, nastepnie usun wszystkich Tomkow z tej inne.kolekcje.listy
//	5) Napisz metode do zadania 4, ktora zwroci najdluzsze imie
//	6) Napisz metode do zadani 4 ktora sprawdza czy podane imie znajduje sie w kolekcji
//	7) Zadeklaruj Liste zmiennych typu double, dodaj do inne.kolekcje.listy 5 liczb rzeczywiste i wypisz je w kolejnosci rosnacej

    // Napisz metode ktora uzupelnia losowa iloscia (od 2-8) liczb losowych z przedziaku 1-10,
    // wrzucmy te liczby do nowej inne.kolekcje.listy posortujmy ja odwrotnie i zwracamy ta liste


    /**
     * Zadanie 9
     * <p>
     * Napisz metode ktora jako parametr przyjmuje liste intow oraz inta i zwraca liste intow ktore sa wieksze niz podany jako parametr int
     */
    public static List<Integer> czyWieksze(List<Integer> liczby, int liczba) {
        List<Integer> wieksze = new ArrayList<>();
        for (int x : liczby) {
            if (x > liczba) {
                wieksze.add(x);
            }
        }
        return wieksze;
    }

    public static List<String> meskie(List<String> imiona) {
        List<String> listaMeskich = new ArrayList<>();
        for (String wczytane : imiona) {
            if (!wczytane.endsWith("a")) {
                listaMeskich.add(wczytane);
            }
        }
        return listaMeskich;
    }

    /**
     * Zadanie 10
     * <p>
     * Wyswietl ile razy było podane imie podane jako parametr
     */
    public static int powtorzoneImie(List<String> imiona) {
        int licznik = 0;
        for (String wczytane : imiona) {
            if (wczytane.equals("Tomek")) {
                licznik++;
            }
        }
        return licznik;
    }

    /**
     * Zadanie 11
     * <p>
     * Napisz metode ktora jako parametr przyjmuje Liste Stringow oraz znak. Zwroc
     * liste zawierajaca wszystkie
     * Stringi ktore zawieraja podana znak
     * Lista: Ania Kasia Grzegorz Tomek Magda a znak to a, to lista zwracana powinna
     * zawierac Ania Kasia Magda
     */
    public static List<String> zwrocZnaki(List<String> lista, char znak) {
        List<String> listaNapisow = new ArrayList<>();
        for (String napis : lista) {
            if (napis.toLowerCase().contains(String.valueOf(znak))) {
                listaNapisow.add(napis);
            }
        }
        return listaNapisow;
    }

    /**
     * Zadanie 12
     * <p>
     * Napisz metode ktora jako parametr przyjmuje 2 Listy Stringow i zwraca liste elementów ktore sa na obu listach
     */
    public static List<String> wspolnaCzesc(List<String> lista, List<String> lista2) {
        List<String> czescWspolna = new ArrayList<>();
        for (String napis : lista) {
            if (lista2.contains(napis) && !czescWspolna.contains(napis)) {
                czescWspolna.add(napis);
            }
        }
        return czescWspolna;
    }

    /**
     * Zadanie 13
     * <p>
     * Napisz metode ktora dla inne.kolekcje.listy intów zwroci roznice pomiedzy jej najwiekszym a najmniejszym elementem
     */
    public static void roznicaMinMax(Set<Integer> zbior) {
        List<Integer> lista = new ArrayList<>();
        lista.addAll(zbior);
        System.out.println(lista);
    }

    /**
     * Zadanie 14
     * <p>
     * Napisz metode ktora przyjmuje liste Stringow i zwraca listę (intow) indeksow
     * wszystkich elementow na liscie, ktore sa takie same jak parametr metody
     * np dla Listy Ania Krzys Ania Piotr Tomek Ania i imienia Ania
     * output: to 0,2,5
     */
    public static List<Integer> listaIndeksow(List<String> lista, String napis) {
        List<Integer> indeksyLiczb = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(napis)) {
                indeksyLiczb.add(i);
            }
        }
        return indeksyLiczb;
    }

    /**
     * Zadanie 15
     * <p>
     * Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr
     */
    public static List<Integer> listaLiczb(List<Integer> lista) {
        List<Integer> odwroconaKolejnosc = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            odwroconaKolejnosc.add(lista.get(i));
        }
        return odwroconaKolejnosc;
    }

    /**
     * Zadanie 16
     * <p>
     * Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr
     * metoda ma odwrocic liste, nie ma nic zwracac, nie mozna wykorzystywac innych list/tablic
     */
    public void reverse(List<Integer> lista) {
        int temp;
        for (int i = 0; i < lista.size() / 2; i++) {
            temp = lista.get(i);
            lista.set(i, lista.get(lista.size() - 1 - i));
            lista.set(lista.size() - 1 - i, temp);
        }
    }

    /**
     * Zadanie 17
     * <p>
     * Napisz metoda ktora sortuje inne.kolekcje malejaco
     */

    /**
     * Zadanie 18
     * <p>
     * majac liste intow zwróc liste intow tych ktore te ktore koncza sie na cyfre podana jako porametr
     */
    public static List<Integer> liczbyKonczaceSieCyfra(List<Integer> lista, int koniec) {
        List<Integer> listaLiczb = new ArrayList<>();
        for (int element : lista) {
            if (element % 10 == koniec) {
                listaLiczb.add(element);
            }
        }
        return listaLiczb;
    }

    public static List<Integer> listaLiczbZparametrem(List<Integer> lista, int a) {
        List<Integer> listaLiczbGotowych = new ArrayList<>();
        for (int liczba : lista) {
            String element = String.valueOf(liczba);
            if ((Character.getNumericValue(element.charAt(element.length() - 1))) == a) {
                listaLiczbGotowych.add(liczba);
            }
        }
        return listaLiczbGotowych;
    }

    /**
     * Zadanie 19
     * Wyświetl ile razy ktorekolwiek imie zostało powtórzone Np dla imion ania piotr ania tomek krzys tomek ania program powinien wypisac 3, bo byly 3 potworki
     */
    public static int powtorzone(List<String> imiona) {
        int licznik = 0;
        List<String> listaPowtorzonych = new ArrayList<>();
        for (String wczytane : imiona) {
            if (!listaPowtorzonych.contains(wczytane)) {
                listaPowtorzonych.add(wczytane);
            } else {
                licznik++;
            }
        }
        return licznik;
    }

    /**
     * Zadanie 20
     * <p>
     * Wyswietl ile razy we wszystkich imionach była użyta samogłoska
     */
    public static int iloscSamoglosek(List<String> imiona) {
        int licznik = 0;
        char[] samogloski = {'a', 'e', 'i', 'o', 'u', 'y', 'ą', 'ę', 'ó'};
        for (String wczytane : imiona) {
            for (int i = 0; i < wczytane.length(); i++) {
                for (char znak : samogloski) {
                    if (wczytane.toLowerCase().charAt(i) == znak) {
                        licznik++;
                    }
                }
            }
        }
        return licznik;
    }

    /**
     * Zadanie 21
     *
     * Napisz metodę która wyswietli unikalne imiona
     */
    public static Set<String> unikalneImiona(List<String> lista) {
        Set<String> unikalneImiona = new HashSet<>(lista);
        return unikalneImiona;
    }

    /**
     * Zadanie 22
     *
     * Zwroc liste imion które sa dluzsze niz 5 znakow o parzystej dlugosci
     */
    public static List<String> imionaDluzszeNiz(List<String> lista) {
        List<String> nowaListaImion = new ArrayList<>();
        for (String element : lista) {
            if (element.length() > 10) {
                nowaListaImion.add(element);
            }
        }
        return nowaListaImion;
    }

    /**
     * Zadnie 23
     *
     * Zwroc liczbe słow ktore sa zlozone z samych whitespaców np spacji
     */
    public static int pusteSlowa(List<String> lista) {
        int licznik = 0;
        for (String element : lista) {
            if (element.isBlank()) {
                licznik++;
            }
        }
        return licznik;
    }

    /**
     * Zadanie 24
     *
     * Napisz metode ktora przyjmuje jako parametr liste Stringow oraz liste intow (tej samej dlugosci obie inne.kolekcje.listy)
     * Metoda ma zwrocic liste Stringow z pirwszej inne.kolekcje.listy ktorych dlugosc odpowiada liczbom na 2 liscie
     * Ania Krzys Tomek Kasia Jan
     * 4 2 5 8 3
     * Ania Tomek Jan
     */
    public static List<String> tejSamejDlugosci(List<String> imiona, List<Integer> liczby) {
        List<String> teSame = new ArrayList<>();
        for (int i = 0; i < imiona.size(); i++) {
            if (imiona.get(i).length() == liczby.get(i)) {
                teSame.add(imiona.get(i));
            }
        }
        return teSame;
    }

    /**
     * Zadanie 25
     *
     * Napisz metode ktora przyjmuje jako parametr liste tablic Stringow i oblicza sume dlugosci wszystkich Stringów
     */
    public static int sumaStringow(List<String[]> lista) {
        int suma = 0;
        for (String[] tablica : lista) {
            for (String element : tablica) {
                suma += element.length();
            }
        }
        return suma;
    }

}
