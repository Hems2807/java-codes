// // abstract class shape{
// //     abstract void draw();

// // void message(){
// //     System.out.println("abstract class");
// // }
// // }
// // class Circle extends shape{
// //     void draw(){
// //         System.out.println("drawing circle");
// //     }
// // }
// // public class java13 {
// //     public static void main(String[] args) {
// //         shape s = new Circle();
// //         s.draw();
// //         s.message();
// //     }
// // }0

// class Demo{
// 	Demo(){
//         this ("default constructor"); //calls parameterized constructor
// 		// this ("Hemani"); //we get the rdundancy
// 	}
// 	Demo(String message){
//         System.out.println(message);
// 	}
//     Demo(int me){
//         System.out.println(me);
//     }
// 	Demo(int a,int b){
// 		System.out.println(a+b);
// 	}
// }
// public class Main{
// 	public static void main(String [] args) {
// 		new Demo();
// 		new Demo(2);
// 		new Demo('H');
// 		new Demo(null);
// 		new Demo(30, 70);
// 	}
// }




// class Parent{
// 	void display(){
// 		System.out.println("parent class mathod");
// 	}
// }
// class Child extends Parent{
// 	void display(){
// 		super.display();
// 		System.out.println("child class method");
// 	}
// }
// public class SuperExampl{
// 	public static void main(String[] args) {
// 		Child c=new Child();
// 		c.display();
// 	}
// }