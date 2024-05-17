//is funtion return type take part in overloading/overriding
//====Only Overloading===>constructor overloading(special case)

//is function access modifier take part in overloading/overriding
//only Overrding:   when Interace

interface MyInter{
    int num=0; //public static final int num (by default
	void testMethod1();//public abstract

	public abstract void testMethod2();

}



class SubClass implements MyInter{

	void testMethod3()
	{
		System.out.println("SubClass Method3");
	}

		//it is must to defined abstract method in Extending class
//package level
	public void testMethod1()
	{
			System.out.println("SubClass implementation of testmethod1(MyInter)");
	}
//package level
	//it is must to defined abstract method in Extending class
	public void testMethod2()
	{
		System.out.println("SubClass implementation of testmethod2(MyInter)");
	}

}

public class TestClass6{

	public static void main(String []args){
           SubClass objr=new SubClass();
           objr.testMethod1();
           objr.testMethod2();
           objr.testMethod3();
           //MyInter itr=new MyInter();

           MyInter itr=new SubClass();
           itr.testMethod1();
           itr.testMethod2();
          //itr.testMethod3();

	}
}