// a user is allowed to inherit a class (including nested class) into another class
	///Extending Static inner class or static nested class
    public class Exclass extends OuterClass.NestedStaticClass
    {
        // Method of derived class
        //Static methods can be inherited but not overrideen!
		//If you declare the same method in a subclass, you hide the superclass method
		//instead of overriding it. Static methods are not polymorphic. At the compile time,
		//the static method will be statically linked.
        public static void func()
        {
            System.out.println("Method of derived class");
        }

		     //Only fields and methods are inherited.
		    // To use inner class properties,
		    //it's inner class must extend inner class of it's super class
		    class ExInnerClass extends InnerClass
		    {
		        //Inner Class of AnotherClass extends Inner Class of OuterClass
		    }

    }