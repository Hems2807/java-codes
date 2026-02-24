import java.util.ArrayList;

public class Fruits {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        System.out.println("Fruits: " + fruits);

        fruits.remove("banana");

        System.out.println("After removing banana: " + fruits);

        System.out.println("Size: " + fruits.size());

        System.out.println("Contains apple: " + fruits.contains("apple"));
    }
}
