package klasy.dziedziczenie.Zad_02;

public class Weapon extends Stuff {
    public double baseAttack, bonus;

    Weapon(char name, double weight, double baseAttack, double bonus) {
        super(name, weight);
        this.baseAttack = baseAttack;
        this.bonus = bonus;
    }

    public double getBaseAttack() {
        return baseAttack;
    }
}
