package klasy.proste_klasy.Zad_10;

public class Sloik {
    Dzem dzem;
    boolean czyOtwarty;

    public Sloik(Dzem dzem) {
        this.dzem = dzem;
    }

    public void otworz() {
        czyOtwarty = true;
    }

    public void zamknij() {
        czyOtwarty = false;
    }

    public void czyOtwarty() {
        if (czyOtwarty == true) {
            System.out.println("Otwarty");
        } else {
            System.out.println("Zamkniety");
        }
    }
}