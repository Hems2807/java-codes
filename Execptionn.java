package string;

class NullPointerExample {
    public static void main(String[] args) {

        try {
            String str = null;
            System.out.println(str.length());   // causes NullPointerException
        }

        catch (NullPointerException e) {
            System.out.println("Null value cannot be accessed");
        }

        System.out.println("Program continues...");
    }
}