// // public class hello{

// //     //your proogram ewith a call to main
// //     public static void main(String[]args){
// //         //to print hello world
// //         System.out.println("Hello World");
// //     }
// // }

// // public class hello{
// //     int x=5;
// //     public static void main(String[]args){
// //         hello myObj=new hello();
// //         System.out.println(myObj.x);
// //     }
// // }

// // // Pattern 5 x 5
// // public class hello {
// //     public static void main(String[] args) {

// //         for (int i = 0; i < 5; i++) {          
// //             for (int j = 0; j < 5; j++) {      
// //                 System.out.print("* ");
// //             }
// //             System.out.println(); 
// //         }
// //     }
// // }

// // 1 2 3 4 5 STARS
// public class hello {
//     public static void main(String[] args) {

//         for (int i = 0; i < 5; i++) {          
//             for (int j = 0; j < 5; j++) {      
//                 System.out.print("* ");
//             }
//             System.out.println(); 
//         }
//     }
// }

// //MIRROR

// 
//write a program for simple calculator
// public class hello{
//     public static void main(String[]arg){
//         // System.out.println("enter first number");
//         int a= 5;
//         int b=10;
//         // System.out.println("enter the operation number");
//         int sum =a+b;
//         int sub =a-b;
//         int mul =a*b;
//         int div =a/b;
//         System.out.println(sum);
//         System.out.println(mul);
//         System.out.println(sub);
//         System.out.println(div);
//     }
// }
// declaration
// public class hello{
//     public static void main(String[]arg){
//         int a=3; //initilization
//         System.out.println(a);
//     }
// }
//object -instance of a class
//initilazing object of a class-
//constrcutors can be used to initilize objects of  a class
//same name as a class
//no return types
//overriding cant be dont by constructor

// public class Test{
//     //default
//     int a;
//     int b;
//     Test(){
//         a=0;
//         b=0;
//     }
//     //parametrized
//     Test(int x,int y){
//         a=x;
//         b=y;
//     }
//     Test(int x){
//         a=x;
//     }
//     public static void main(String[] args){
//     //creating objects
//     Test m1 =new Test();
//     Test m2 =new Test(5,8);
//     Test m3=new Test(7);

//     // System.out.println(m1.a" "m2.b);
//     System.out.println(m2.a);
//     System.out.println(m2.a+""+m2.b);
//     System.out.println(m3.a);
//     }
// }

//roll,name

// public class Test{
//     //default
//     int rollnumber;
//     string name;
//     Test(){
//         rollnumber=0;
//         name=0;
//     }
//     //parametrized
//     Test(int x,string y){
//         rollnumber=55;
//         name="hemani";
//     }
//     Test(int x){
//         rollnumber=1;
//     }
//     public static void main(String[] args){
//     //creating objects
//     Test m1 =new Test();
//     Test m2 =new Test(11,"rohini");
//     Test m3=new Test(7);

//     // System.out.println(m1.a" "m2.b);
//     System.out.println(m2.a);
//     System.out.println(m2.a+""+m2.b);
//     System.out.println(m3.a);
//     }
// }
//instance variable
//static variable-can acces the variable anywhere with the help of class name 
//global variable
public class Test{
    static int a=0; //gloabal variable
public static void main(String[] args){
        // int a=0;
        System.out.println(a);
}
// //
Test m1 =new Test(11);
System.out.println(m1.a);
}

//multiple objects can be avoided
//a single copy and shared by all objects
//directy wiht class name

//jvm -java virtual memory
//stack-referance of heap memory
//heap-stores the actual object
//new ClassName()
//when object are no loger neede then the cleaing out of heap memory 
//java is automatic garbage collector
