import java.util.Scanner;
public class StudentClass{

	//Object oriented programming says
	//member must be private
	//Instance(Object) variables of class
	/*private int rno;
	private String name;
	*/
	 int rno;
     String name;


public static void main(String []args){

	StudentClass stobjr=new StudentClass();
	stobjr.rno=111;
	stobjr.name="sumit";

	System.out.println("Rno=>"+stobjr.rno);
	System.out.println("Name=>"+stobjr.name);
}

}