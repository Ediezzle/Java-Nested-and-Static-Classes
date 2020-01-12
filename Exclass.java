// a user is allowed to inherit a class (including nested class) into another class
	///Extending Static inner class or static nested class
    public class Exclass extends OuterClass.NestedStaticClass
    {
        // Method of derived class
        public void func()
        {
            System.out.println("Method of derived class");
        }
    }