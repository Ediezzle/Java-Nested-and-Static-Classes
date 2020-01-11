/* Java program to demonstrate how to implement static and non-static
   classes in a java program. */
class OuterClass{
   private static String msg = "GeeksForGeeks";
   private String webAddress = "www.geeksforgeeks.org";

   // Static nested class
   public static class NestedStaticClass{
		//N.B: unlike in C#, Java doesn't allow static constructors

       // Only static members of Outer class is directly accessible in nested
       // static class
       public void printMessage() {

         // Try making 'message' a non-static variable, there will be
         // compiler error
         System.out.println("Message from nested static class: " + msg);

  		// This would result in a compiler error, since you cannot access non-static variable
  		//from a static method
         //System.out.println("Sender: " + webAddress);
       }
    }

    // non-static nested class - also called Inner class
    public class InnerClass{

       // Both static and non-static members of Outer class are accessible in
       // this Inner class
       public void display(){
          System.out.println("Message from non-static nested class: "+ msg);
          System.out.println("Sender: " + webAddress);
       }
    }
}