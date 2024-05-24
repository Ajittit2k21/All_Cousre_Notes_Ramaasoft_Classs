class SuperClass1
{
	//package
	void super1Method()
	{
		System.out.println("SuperClass1 Method");
	}

}
class SuperClass2
{
	//package
	void super2Method()
	{
		System.out.println("SuperClass2 Method");
	}

}
//Multiple inheritance not possible  Why:
class Subclass extends SuperClass1,SuperClass2{
	void subMethod()
	{
		System.out.println("SubClass Method");
	}
}


public class TestEx2{
  public static void main(String []args){
	  Subclass objr=new Subclass();
	  objr.superMethod();
	  objr.subMethod();
  }
}