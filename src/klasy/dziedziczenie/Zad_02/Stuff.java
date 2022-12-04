package klasy.dziedziczenie.Zad_02;

public class Stuff {
    char name;
    double weight;

    Stuff(char name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return "Nazwa przedmiotu: " + this.name + "\nWaga przedmiotu: " + this.weight;
    }

    public double getBaseAttack() {
        return 0;
    }
}