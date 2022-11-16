package kolekcje.mapy.teoria;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        // klucze
        hashMap.put(1, "Jeden");
        hashMap.put(0, "Zero");

        hashMap.put(2, "Dwa");
        hashMap.put(3, "Trzy");
        hashMap.put(null, "");
        System.out.println("dupa");
        System.out.println(hashMap.get(2));

        System.out.println("Wartosci");

        System.out.println(hashMap.values());

        System.out.println();

        System.out.println("Rozmiar: ");
        System.out.println(hashMap.size());

        System.out.println();

        System.out.println("Mapa");
        System.out.println(hashMap);

        System.out.println(hashMap.get(1));

        System.out.println();

        for (int x = 0; x < hashMap.size(); x++) {
            System.out.println(hashMap.get(x));
        }

        System.out.println();

        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsKey(6));

        hashMap.clear();

        System.out.println("Clear");
        System.out.println(hashMap);
        System.out.println();

        hashMap.put(1, "Jeden");

        hashMap.put(0, "Zero");

        String tekst = "Jajo";
        hashMap.put(tekst.length(), tekst);
        hashMap.put(3, "Trzy");
        hashMap.put(null, "");

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            System.out.println(entry.getKey());
        }
    }
}
