package klasy.proste_klasy.Zad_09;

public class Owoc {
    String nazwa;
    double waga;

    public Owoc(String nazwa) {
        this.nazwa = nazwa;
        this.waga = Math.random() * (0.8 - 0.5 + 1) - 0.5;
    }

    public void wypisz() {
        System.out.println(this.nazwa);
        System.out.println(this.waga);
    }
}
