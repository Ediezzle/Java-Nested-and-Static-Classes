public class InheritedClass extends OuterClass.InnerClass
{
	public InheritedClass()
	{
		//accessing super class constructor through OuterClass instance because
		// you can’t access non-static inner class without the instance of outer class
		new OuterClass().super();
	}
}