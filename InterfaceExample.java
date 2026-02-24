//interface is  a blueprint of a class that contains abstract methods.
//class is blueprint of object
//multiple inheritance-diamond problem
//A extends B ,C not possible
// interface Animal{
//     void sound();
// }
// class Dog implements Animal{
//     public void sound(){
//         System.out.println("Dog barks");
//     }
// }

// public class InterfaceExample{
//     public static void main(String[] args) {
//         Animal a= new Dog();
//         a.sound();
//     }
    
// }

//multiple inheritance
interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
class Cat implements Animal{
    public void sound(){
        System.out.println("Cat Meow");
    }
}

public class InterfaceExample{
    public static void main(String[] args) {
        Animal a= new Dog();
        a.sound();
        Animal b=new Cat();
        b.sound();
    }
    
}
