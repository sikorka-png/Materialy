package klasy.proste_klasy.Zad_10;

public class Dzem {
    private String smak;
    private double waga;

    public Dzem(String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    public Dzem(double waga) {
        this.waga = waga;
        this.smak = "No name";
    }

    public Dzem(String smak) {
        this.smak = smak;
        this.waga = 100.0;
    }


}
