// public class copy {
//     static int a =0;
//     void print (int a){
//         a=a+10;
//         System.out.println(a);
//     }
//     public static void main(String[] args){
//         int a=10;
//         copy C =new copy();
//         C.print(a); 
//         System.out.println(a);
//     }
// } 

//Wrapper Classes-use s the primitives as objects(autoboking) (~unboxing)
//convert form one from to other
//outside wrapping-int to Integer ,char to Character

public class copy{
public static void main(String[] args){

    String a="10";
    System.out.println(a);
    int b=Integer.parseInt(a);
    System.out.println(b);
    String f="10.58";
    System.out.println(f);
    double e=Double.parseDouble(f);
    System.out.println(e);
    char c ='a';
    int d=(int)c+10;
    c=(char)d;
    System.out.println(d);
    System.out.println(c);


}
}