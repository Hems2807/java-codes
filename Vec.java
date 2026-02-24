import java.util.Vector;
public class Vec {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.println("vector"+numbers);
        numbers.remove(1);
        System.out.println("after revmoving index 1"+numbers);

        System.out.println("size"+numbers.size());
        System.out.println("element of index 0"+numbers.get(1)); 
    }   
}
