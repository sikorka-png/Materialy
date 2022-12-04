package klasy.proste_klasy.Zad_01;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 10.0;
        p1.y = 12.0;
        Point p2 = new Point();
        p2.x = 11.0;
        p2.y = 13.0;

        Rect myR = new Rect(
                new Point(2, 3),
                new Point(2, 6)
        );
    }
}
