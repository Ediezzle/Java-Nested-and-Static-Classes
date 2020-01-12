class AnotherExClass extends OuterClass
{
     //Only fields and methods are inherited.
    // To use inner class properties,
    //it's inner class must extend inner class of it's super class
    class AnotherExInnerClass extends InnerClass
    {
        //Inner Class of AnotherClass extends Inner Class of OuterClass
    }
}