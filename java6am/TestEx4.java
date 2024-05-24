class SuperClass
{
	//package
	void superMethod()
	{
		System.out.println("SuperClass Method");
	}

}

class SubClass1 extends SuperClass
{
	//package
	void subClass1Method()
	{
		System.out.println("SubClass1 Method");
	}

}
class Subclass2 extends SuperClass{
	void subClass2Method()
	{
		System.out.println("SubClass2 Method");
	}
}


public class TestEx4{
  public static void main(String []args){
	  SubClass1 objr1=new SubClass1();
	  	  objr1.superMethod();
	  	  objr1.subClass1Method();

	  Subclass2 objr2=new Subclass2();
	  objr2.superMethod();
	  objr2.subClass2Method();

  }
}