package string;

// Custom Unchecked Exception
class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String m) {
        super(m);
    }
}
// Using the Custom Exception
public class EXCPP {
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new DivideByZeroException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }
    public static void main(String[] args) {
        // try {
        //     divide('A', 0);
        // }
        // catch (DivideByZeroException e) {
        //     System.out.println("Caught Exception: " + e.getMessage());
        // }
    }
}
// what is the diff between throws and throw

//scenario