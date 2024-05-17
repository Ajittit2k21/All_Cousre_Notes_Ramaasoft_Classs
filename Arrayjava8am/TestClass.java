import java.util.Scanner;

class OutterClass1{

   //inside the class inheritance possible
   class SuperClass{
       void testMethod1()
       {
		   System.out.println("testMethod1 called");
	   }
   }
   class SubClass extends SuperClass{


   }


}

class OutterClass2{

    //class its allowed to defined inner abstract class
    abstract class AbsSuperClass{
        abstract void testMethod2();
	}

	class SubClass extends AbsSuperClass{
            void testMethod2()
	        {
	 		   System.out.println("testMethod2 called");
	 	    }


	}

}


class OutterClass3{

   //inside the class interface its possible or not

   interface MyInter{
         void testMethod3();
	}

	class SubClass implements MyInter{

          public  void testMethod3()
	        {
	 		   System.out.println("testMethod3 called");
	 	   }

	}

}

public class TestClass{

	public static void main(String []args){

			OutterClass1 objr1=new OutterClass1();
			OutterClass2 objr2=new OutterClass2();
			OutterClass3 objr3=new OutterClass3();
			objr1.testMethod1();
			objr2.testMethod2();
			objr3.testMethod3();

			//inobjr.innerMethod();
             //Create an object of
             //SubClass----from OutterClass1----------and call testMethod1()
             //SubClass----from OutterClass2----------and call testMethod2()
             //SubClass----from OutterClass3----------and call testMethod3()


	}

}