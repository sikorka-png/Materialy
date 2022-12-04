package klasy.dziedziczenie.Zad_01;

public class Komorka extends Telefon {

    public String[] lastCallTab = new String[10];
    int lastCallIndex = -1;
    boolean lastCallTabFull = false;

    public Komorka(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
    }

    @Override
    public void zadzwon(String numer) {
        super.zadzwon(numer);

        if (++lastCallIndex == lastCallTab.length) {
            lastCallIndex = 0;
            lastCallTabFull = true;
        }
        lastCallTab[lastCallIndex] = numer;
    }

    public void wyswietlHistoriePolaczen() {
        if (lastCallTabFull) {

            for (int i = lastCallIndex; i >= 0; i--) {
                System.out.println(lastCallTab[i]);
            }

            for (int i = lastCallTab.length - 1; i >= lastCallIndex + 1; i--) {
                System.out.println(lastCallTab[i]);
            }

        } else {
            for (int i = lastCallTab.length - 1; i >= 0; i--) {
                if (lastCallTab[i] != null)
                    System.out.println(lastCallTab[i]);
            }
        }
        System.out.println();

    }


}
