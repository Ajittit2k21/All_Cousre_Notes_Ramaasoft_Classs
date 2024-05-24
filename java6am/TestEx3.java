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
//Multiple inheritance not possible  Why:
class Subclass2 extends SubClass1{
	void subClass2Method()
	{
		System.out.println("SubClass2 Method");
	}
}


public class TestEx3{
  public static void main(String []args){
	  Subclass2 objr=new Subclass2();
	  objr.superMethod();
	  objr.subClass1Method();
	  objr.subClass2Method();
  }
}