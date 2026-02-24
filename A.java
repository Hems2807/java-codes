public class A {
    static int a =0;
    void print (){
        System.out.println(a);
    }
    static void print1 (){
        System.out.println(a);
    }

    public static void main(String[] args){
        A a = new A();
        a.print();
        A.print1();
    }
} 