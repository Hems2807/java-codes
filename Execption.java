// execption handeling 
//to write your own execptions custon execption
//try catch
//throw throws
//check uncheck  fullychecked
package string;

public class Execption {
    public static void main(String[] args) {
        try{
            System.out.println("outer try block started");

            try{
                System.out.println("inner try block started");
                int result=10/0;
            }
            //cant use catch without try
            // catch(ArithmeticException e){
            //     System.out.println("caught exception in inner block" +e.getMessage());
            // }
            String str =null;
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("caught execption in outer block "+ e.getMessage());
        }
        }finally{
            System.out.println("finally block of outer try executed");
        }
        System.out.println("program continues aftere nested try catch");
    }
  
}

//we can use throw in any try block or any 
// throw statement is used in indication that a method may throw an exception explicitly
//let the user handel execption
//finally block is always executed

//removing the main
