package string;
public class Str {
    public static void main(String[] args) {

        String name = "Hemani";

        System.out.println("Name: " + name);

        // Length of string
        System.out.println("Length: " + name.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // Check if contains word
        System.out.println("Contains 'man': " + name.contains("man"));

        // Replace characters
        System.out.println("Replace a with o: " + name.replace('a', 'o'));

        // Get character at position
        System.out.println("Character at index 2: " + name.charAt(2));
    }
}

