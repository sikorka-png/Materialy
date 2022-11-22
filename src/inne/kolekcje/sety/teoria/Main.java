package inne.kolekcje.sety.teoria;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Sety - przyjmuja tylko unikalne elementy

        // HashSet
        // Zbior nieuporzadkowany, akceptuje wartosci null
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(3, 5, 4, 3, 5, 5, 8, 1, 0));
        System.out.println(hashSet);

        // LinkedHashSet
        // Do przechowywania elementow wykorzystuje hashtable, nie sortuje element�w w
        // secie
        // zachowuje kolejnosc elementow zgodna z kolejnoscia dodawania,akceptuje
        // wartosci null
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(3, 5, 7, 3, 5, 4, null, 3, 2));
        System.out.println(linkedHashSet);

        // TreeSet
        // Sortuje elementy w secie, ale nie akceptuje wartosci null
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(2, 13, 5, 3, 6, 3, 7));
        System.out.println(treeSet);
    }
}
