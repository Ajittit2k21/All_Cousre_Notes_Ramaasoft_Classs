import java.util.Scanner;

class Student{

	//member method //member fucntion
	// setInput() and getInput
	int id,age;
	String name;
	void setInput()
	{
	   Scanner myobjr=new Scanner(System.in);
	   System.out.println("Enter My Details:");
	   System.out.println("Enter id:");
	   id=myobjr.nextInt();
	   System.out.println("Enter name:");
	   name=myobjr.nextLine();
	   myobjr.nextLine();
	   System.out.println("Ente Age:");
	   age=myobjr.nextInt();



	}
	void getInput()
	{
		System.out.println("Id=>"+id);
		System.out.println("Name=>"+name);
		System.out.println("Age=>"+age);

	}


}
public class MyAbc{

	public static void main(String[]args){

		Student sobjr=new Student();
		sobjr.setInput();
		sobjr.getInput();


	}



}
