class SuperClass{

	void superMethod() //package level
	{
		System.out.println("SuperClass method");
	}


}

//extending properties of SuperClass into subClass
class SubClass1 extends SuperClass{  //when a subclass extends properites of superClass
	//package level                  //and this subclass again extends by another subClass2
	//void superMethod();            //MULTILEVEL 
	void sub1Method()//package level
	{
		System.out.println("SubClass1 method");
	}
}
class SubClass2 extends SubClass1{
	//package level
	//void superMethod();//transitive in nature(automatically properties of SuperClass)
	                     //transfer to subClass2
	//void sub1Method();
	void sub2Method()//package level
	{
		System.out.println("SubClass2 method");
	}
}

public class MultiLevelInheritance{
	public static void main(String []args){
    SubClass2 subobjr=new SubClass2();
    subobjr.superMethod();
    subobjr.sub1Method();
	subobjr.sub2Method();

	}
}