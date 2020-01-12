public class InheritedClass extends OuterClass.InnerClass
{
	//sub class constructor must explicitly call super class constructor using an instance
	 //of outer class
	public InheritedClass()
	{
		//accessing super class constructor through OuterClass instance because
		// you can’t access non-static inner class without the instance of outer class
		new OuterClass().super();
	}
}