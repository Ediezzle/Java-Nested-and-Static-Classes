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

	//When an outer class is extended by it’s sub class, Member inner classes will not be
	//inherited to sub class. To use inner class properties inside the sub class of outer class,
	//sub class must also have an inner class and that inner class must extend inner class of the
	//outer class.

	//non-static class calling non-static method in parent's inner static class
	public class InheritedInnerClass extends OuterClass.NestedStaticClass
	{
		//non-static method
		public void Experiment()
		{
			//creating an object of this non-static inner class
			InheritedInnerClass iic = new InheritedInnerClass();

			//calling non-static method of parent class' nested static class
			iic.printMessage();
		}

	}

	//static class calling non-static method in parent's inner static class
	public static class StaticInheritedInnerClass extends OuterClass.InnerClass
		{
			public String s = "";
			public StaticInheritedInnerClass()
			{
				new OuterClass().super();
			}

			//non-static method
			public void AnotherExperiment()
			{
				//creating instance of OuterClass from which we can create an instance of
				//InnerClass so that we can call InnerClass' non-static display method
				OuterClass outerClass = new OuterClass();
				OuterClass.InnerClass innerClass = outerClass.new InnerClass();
				innerClass.display();
			}
		}

			//static class calling static method in parent's inner static class
			public class AnotherStaticInheritedClass extends OuterClass.NestedStaticClass
			{
				public void SomeMoreExperiment()
				{
					OuterClass.NestedStaticClass.printDateAndTime();
				}
			}





}