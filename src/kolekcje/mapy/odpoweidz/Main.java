package kolekcje.mapy.odpoweidz;

import javax.swing.*;
import java.util.*;

public class Main {
    /**
     * Zadanie 1
     *
     * Napisz metode ktora pozwala dodawac do mapy kolejne wyrazy. Na koncu ma wyswietlic ile razy jaki element byl dodany
     */
    public static void dodajTekst(String tekst, Map<String, Integer> mapa) {
        if (!mapa.containsKey(tekst)) {
            mapa.put(tekst, 1);
        } else {
            mapa.put(tekst, (mapa.get(tekst) + 1));
        }

    }

    /**
     * Zadanie 2
     *
     * napisz metode ktora przyjmuje Mape<Integer, String>, zamien wartosci ktorych klucze sa parzystych wartosci na słowo "parzyste"
     */
    public static void zmienParzyste(Map<Integer, String> mapa) {
        for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
            if (entry.getKey() % 2 == 0) {
                mapa.put(entry.getKey(), "parzyste");
            }
        }
    }

    /**
     * Zadanie 3
     *
     * Napisz program, ktory symuluje dzialanie slownika polsko-angielskiego.
     * Przykładowy program:
     * Podaj slowko po Polsku: mama Slowko po Angielsku to mother.
     * Program dziala dopoki uzytkownik nie zrezygnuje
     * (cancel)
     */
    public static void slownik() {
        String word;
        do {
            word = JOptionPane.showInputDialog(null, "Podaj slowo po polsku");
            Map<String, String> dictionary = new HashMap<String, String>();
            dictionary.put("witam", "hello");
            dictionary.put("pies", "dog");
            dictionary.put("kot", "cat");
            dictionary.put("pensja", "salary");
            if (dictionary.containsKey(word)) {
                JOptionPane.showMessageDialog(null, "Slowo po angielsku to " + dictionary.get(word));
            } else {
                JOptionPane.showMessageDialog(null, "Nie znaleziono slowa w slowniku");
            }
        } while (!word.equals("koniec"));
    }

    /**
     * Zadanie 4
     *
     * W systemie przechowujemy nazwe klasy (szkolnej, np 1a, 2b) oraz listę osób
     * (same nazwiska jako Stringi) które uczeszczaja do klasy.
     * 1) Napisz metode ktora zwraca liste osob o najdluzszych nazwiskach z kazdej
     * klasy
     * 2) Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas
     */
    public static List<String> maxNamesFromEachClass(Map<String, List<String>> map) {
        List<String> names = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            names.add(findMaxName(entry.getValue()));
        }
        return names;
    }

    /**
     * Zadanie 5
     *
     * Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas
     */
    public static String maxNameFromSchool(Map<String, List<String>> map) {
        return findMaxName(maxNamesFromEachClass(map));
    }
    public static String findMaxName(List<String> list) {
        String max = list.get(0);
        for (String name : list) {
            if (name.length() > max.length()) {
                max = name;
            }
        }
        return max;
    }


}
