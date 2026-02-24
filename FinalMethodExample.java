// class Demo{
// 	static int count=0;
// 	 Demo(){
// 		 this ("default constructor"); //calls parameterized constructor
// 	 }
// 	 Demo(String message){
// 		count++;
// 		System.out.println(message);
// 	 }
// }
// public class Main{
// 	public static void main(String [] args) {
// 		new Demo();
// 	}
// // }

// class parent{
// 	void display(){
// 		System.out.println("Parent class method");
// 	}
// }
// class Child extends parent{
// 	void display(){
// 		super.display();
// 		System.out.println("Child class method");
// 	}
// }
// public class Main{
// 	public static void main(String[] args){
// 	Child c = new Child();
// 	c.display();
// 	}
// }


// class Animal {
//     void eat() {
//         System.out.println("Eating");
//     }
// }

// class Tiger extends Animal {
//     void bark() {
//         System.out.println("Barking");
//     }
// }

// class parent {
//     parent(){
//         System.out.println("parent class mathod");
//     }
// }
// class child extends parent{
// 	child(){
// 		super();
// 		System.out.println("child claass constryuctor");
// 	}
// }
// public class Main{
// 	public static void main(String[] args){
// 		new child();
// 	}
// }

// class employee{
// 	void displayinfo(){
// 		System.out.println("employee information");
// 	}
// }
// class manager extends employee{
// 	void displayinfo(){
// 		super();
// 		System.out.println("manager information");
// 	}
// }
// public class Main{
// 	public static void main(String[] args){
// 		new manager();
// 	}
// }

//final method cannot be overwtien anywhere
class parent{
	final void display(){
		System.out.println("final method is parnt class");
	}
}
class child extends parent{
	void display(){
		System.out.println("child  class");
	}
}

public class FinalMethodExample{
	public static void main(String[] args) {
		child c =new child();
		c.display();
	}
}

final class FinalClass {
	void display(){
		System.out.println();
	}

	
}