class SuperClass{

	 private void show(){

		System.out.println("first method");
	}



}
class SubClass extends SuperClass{

	private void  getshow(){

		System.out.println("Second method");
	}



}

public class SingleClass{
	public static void main(String[]args){
       System.out.println("Main method");
		SubClass sobjr =new SubClass();
		   		   sobjr.show();
		   		   sobjr.getshow();


		}

	}

