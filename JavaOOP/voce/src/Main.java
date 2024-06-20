import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Kreiranje voćnjaka
        List<Fruit> fruitList = new ArrayList<>();

        // Dodavanje različitih voćaka u voćnjak
        Fruit fruit1 = new Fruit("Apple", 50, 10.0);
        Fruit fruit2 = new Fruit("Banana", 30, 5.0);
        Peach peach = new Peach("Peach", 20, 8.0, 6);
        Cherry cherry = new Cherry("Cherry", 40, 12.0, false);

        fruitList.add(fruit1);
        fruitList.add(fruit2);
        fruitList.add(peach);
        fruitList.add(cherry);

        // Ispis informacija o voćkama
        for (Fruit fruit : fruitList) {
            System.out.println(fruit.toString());
            System.out.println("Production Price for 10 Trees: " + fruit.productionPrice(10));
            System.out.println("Market Price per Fruit: " + fruit.myMarketPrice());
            System.out.println();
        }
    }
}