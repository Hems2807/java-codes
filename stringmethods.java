package string;

public class stringmethods {
    public static void main(String[] args) {
        String str = " Java Programming";
        System.out.println("Length: " + str.length());
        System.out.println("Trimed :" +str.trim());
        System.out.println("uppercase:"+str.concat(str));
        System.out.println("substring: "+ str.substring(2,5));
        System.out.println("replace java with python" + str.replace(" Java","python"));
    }
    
}
