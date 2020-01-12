/* Java program to demonstrate how to implement static and non-static
   classes in a java program.
   N.B: Unlike C#, Java doesn't allow outer-most class to be static*/
import java.time.LocalDateTime;
public class OuterClass{
   private static String msg = "GeeksForGeeks";
   private String webAddress = "www.geeksforgeeks.org";
   private static LocalDateTime ldt = LocalDateTime.now();

public static String func(){
	return "func";
}
   // Static nested class
   public static class NestedStaticClass{
		//N.B: unlike in C#, Java doesn't allow static constructors. What's the purpose anyway?
		//Isn't it constructors are meant for instance object initialisation?

		//Unlike in C#, in Java a static class can have instance variables which can be used by
		//non static methods
		public String s = "string";

       // Only static members and methods of Outer class are directly accessible in nested
       // static class
       //Unlike in C#, static nested class can have non static methods in Java
       public void printMessage() {

         // Try making 'message' a non-static variable, there will be
         // compiler error
         System.out.println("Message from nested static class: " + msg);

  		// This would result in a compiler error, since you cannot access non-static variable
  		//from a static method
         //System.out.println("Sender: " + webAddress);
       }

       public static void printDateAndTime(){
		   System.out.println("Date and Time: " + ldt);
	   }
    }

    // non-static nested class - also called Inner class
    public class InnerClass{

       // Both static and non-static members and methods of Outer class are accessible in
       // this Inner class
       public void display(){
          System.out.println("Message from non-static nested class: "+ msg);
          System.out.println("Sender: " + webAddress);
       }
    }
}