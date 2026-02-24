package string;

public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");

        sb.append("World");
        System.out.println(sb);

        sb.insert(6, "java");
        System.out.println(sb);

        sb.replace(0, 5, "HI");
        System.out.println(sb);

        sb.delete(2, 5);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
    
}
