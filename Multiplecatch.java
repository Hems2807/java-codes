package string;

public class Multiplecatch {
    public static void main(String[] args) {
        try{
            String str=null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("error null pointer exception object is null");

        }catch(Exception e){
            System.out.println("some other error occored");
        }
        System.out.println("rogram continues after exeception handeling");
    }
}