class SuperClass{

	SuperClass()
	{
		this(100);
		System.out.println("SuperClass Parameterless Constructor");
	}

	SuperClass(int x)
	{
		System.out.println("SuperClass parameterized version");
	}
	void testMethod()
	{
		System.out.println("SubClass Method");
	}

}
class SubClass extends SuperClass{

	SubClass()  //Object creation call
	{
		super();
		System.out.println("SubClass Parameterless Constructor");
	}
	SubClass(int x)
	{
		 this(); //this() in case constructor call must be first statement
	//xxx	 super(); //super() in case constructor call must be first statement

		 System.out.println("SubClass paramerized constructor");
	 }

	void testMethod()
	{
		System.out.println("SubClass Method");
	}

}
class TestClass1{


	public static void main(String []args)
	{
	   	SubClass objr=new SubClass();  //SubClass----Object---constructor SubClass(intx)   //3.Subclass parameterized
	   	                                                                  //  this()---currect class
	   	                                                                  //     parameterless
	   	                                                                  //        |
	   	                                                                  //    SubClass()      //2. SubClass parameterless
	   	                                                                  //    super()
	   	                                                                  //      |
	   	                                                                  //    SuperClass() //1.Superclass parameterless
	   	                                                                  //
	   	                                                                  //
	   	                                                                  //

	}

}