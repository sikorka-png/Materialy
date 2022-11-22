package inne.kolekcje.listy.teoria;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(5 & 0);
        System.out.println("jajko");

        List<Integer> listaL = new ArrayList<>();
        listaL.add(1);
        listaL.add(2);
        listaL.add(3);

        System.out.println(Collections.max(listaL));
        for (Integer x : listaL) {
            System.out.println(x);
        }

        System.out.println(listaL);

        listaL.remove(1);

        System.out.println(listaL);

        listaL.remove(Integer.valueOf(3));

        System.out.println("jajko".contains("b"));

        // inne.kolekcje.listy

        // inne.kolekcje niegeneryczne - nie wymagaja aby elementy w niej przechowywane byly
        // tego samego typu
        // nie jest to dobra praktyka, bo moga byc problemy z zapisem, odczytem danych
        // roznych typow
        List listaNiegeneryczna = new ArrayList();
        listaNiegeneryczna.add("Kot");
        listaNiegeneryczna.add(1);
        listaNiegeneryczna.add(true);

        // inne.kolekcje generyczye, typowane - oznacza ze kolekcja moze przechowywac tylko
        // dane tego samego typu

		/*
		 * ArrayList
		 * 1) Przechowuje elementy w dynamicznej tablicy - nie podajemy jej rozmiaru
		 * 2) Dane zapisywane w pamieci znajduja sie obok siebie
		   3) Operacja wyjecia jest szybsza niz na LinkedList, ale usuniecie jest wolniejsze
		 */

        List<String> imiona = new ArrayList<>();

        // metoda add() - metoda ktora dodaje cos do kolekcji
        imiona.add("Tomek");
        imiona.add("Karolina");
        imiona.add("Piotr");

        System.out.println(imiona);

        // metoda addAll() - metoda ktora dodaje inne.kolekcje do kolekcji
        // Arrays.asList() tworzy z elementow oddzielonych przecinkami kolekcję
        imiona.addAll(Arrays.asList("Grzegorz", "Ania", "Tomek"));
        System.out.println(imiona);

        // metoda size() - rozmiar kolekcji
        System.out.println("Rozmiar kolekcji: " + imiona.size());

        // metoda get(x) - zwraca element o indeksie x
        System.out.println("Element pierwszy: " + imiona.get(0));

        //	list.remove(Integer.valueOf(2));


        // wypisanie kolekcji za pomoca zwyklej petli
        for (int x = 0; x < imiona.size(); x++) {
            System.out.print(imiona.get(x) + " ");
        }

        System.out.println();

        // wypisanie kolekcji za pomoca for eacha
        for (String imie : imiona) {
            System.out.print(imie + " ");
        }

        System.out.println();

        // wypisanie kolekcji za pomoca iteratora
        // iterator pozwala na iterowanie po kolekcjach, metoda next() - zwraca nastepny
        // element iteratora, metoda hasNext() zwraca true dopoki cos sie znajduje w
        // iteratorze
        Iterator<String> iterowanie = imiona.iterator();
        while (iterowanie.hasNext()) {
            System.out.print(iterowanie.next() + " ");
        }

        System.out.println();

        // metoda contains(x) - zwraca true jesli element x znajduje sie w kolekcji
        System.out.println("Czy Klaudia jest w kolekcji? " + imiona.contains("Klaudia"));
        System.out.println("Czy Tomek jest w kolekcji? " + imiona.contains("Tomek"));

        System.out.println(imiona);

        // metoda remove(x) - usuniecie z kolekcji elementu x badz indeksu x
        imiona.remove(0);
        System.out.println(imiona);

        imiona.remove("Piotr");
        System.out.println(imiona);

        // metode removeAll() - usuniecie z kolekcji innej kolekcji
        imiona.removeAll(Arrays.asList("Ania", "Tomek"));
        System.out.println(imiona);

        imiona.addAll(Arrays.asList("Piotr", "Ania", "Karolina", "Tomek"));

        System.out.println(imiona);

        // metoda isEmpty() - zwraca true jesli kolekcja jest pusta
        System.out.println("Czy kolekcja jest pusta? " + imiona.isEmpty());

        // metoda indexOf(x) - zwraca indeks pierwszego wystapienia elementu x
        // jesli elementu x nie ma w kolekcji to zwraca -1
        System.out.println("Indeks pierwszego wystapienia Karoliny: " + imiona.indexOf("Karolina"));

        // metoda lastIndexOf(x) - zwraca indeks ostatniego wystapienia elementu x
        // jesli elementu nie ma w kolekcji to zwraca -1
        System.out.println("Indeks ostatniego wystapienia Karoliny: " + imiona.lastIndexOf("Karolina"));

        // metoda set(indeks, element) - zastepuje element po podanym indeksie innym
        // elementem
        imiona.set(5, "Monikaaaaaaaa");
        System.out.println(imiona);

        // metoda toString() tworzy Stringa z kolekcji
        String kolekcja = imiona.toString();
        System.out.println(kolekcja.charAt(0));

        // getClass() - zwraca reprezentacje klasowa kolekcji
        System.out.println(imiona.getClass());

        // getSimpleName() - zwraca typ kolekcji bez zadnych dodatkow
        System.out.println(imiona.getClass().getSimpleName());

        // metoda sublist(x,y) zwraca podliste od indeksu podanego jako pierwszy
        // parametr uwzgledniajac go
        // do indeksu drugiego podanego jako parametr nieuwzgledniajac go
        System.out.println(imiona.subList(1, 4));

        // toArray() - metoda ta tworzy tablice Objectow z elementow kolekcji
        Object[] tablica = imiona.toArray();

        for (Object element : tablica) {
            System.out.print(element + " ");
        }

        System.out.println();

        // clear() - metoda czyszczaca inne.kolekcje
        // listaImion.clear();
        System.out.println(imiona);

        // metoda equals() zwraca true jesli dwie inne.kolekcje sa takie same
        System.out.println(imiona.equals(imiona));

        // LinkedList
        /*
         * 1) Przechowuje wewnetrznie elementy opakowane w obiekty wskazujace na element poprzedni i nastepny
         * 2) Dane w pamieci jej sa zapisywane rozstrzelone
         * 3) Patrz punkt 3 przy ArrayList
         */
    }
}
