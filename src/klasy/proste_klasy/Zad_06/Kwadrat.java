package klasy.proste_klasy.Zad_06;

public class Kwadrat {

    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public void show() {
        System.out.println("Pole kwadratu wynosi: " + this.bok * this.bok);
        System.out.println("Objętość sześcianu wynosi: " + this.bok * this.bok * this.bok);
    }
}
