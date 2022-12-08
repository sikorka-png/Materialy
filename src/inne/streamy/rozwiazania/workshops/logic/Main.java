package inne.streamy.rozwiazania.workshops.logic;

public class Main {
    public static void main(String[] args) {
        WorkShop workShop = new WorkShop();
        System.out.println(workShop.getAllCurrencies());
        System.out.println(workShop.getMostPopularAccountType().getName());
    }
}
