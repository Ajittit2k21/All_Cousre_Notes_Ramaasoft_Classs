
import java.util.Scanner;
public class TestClass{
	public static void main(String args[]){


	    Scanner objr=new Scanner(System.in);
	   System.out.println("Enter two values:");
	   int num1=objr.nextInt();
	   int num2=objr.nextInt();
	   System.out.println("press 1 Additon");
	   System.out.println("press 2 Substraction");
	   System.out.println("press 3 Multiplication");
	   System.out.println("press 4 Division");
	   System.out.println("Select any opreation");
	   int ich=objr.nextInt();


	   switch(ich)
	   {
		   case 1:
		     				System.out.println("Sum of two values="+(num1+num2));
		     				break;
		   case 2:
		   		     		System.out.println("Substration of two values="+(num1-num2));
		   		     		break;
		   case 3:
		   		     		System.out.println("Multiplication of two values="+(num1*num2));
		   		     		break;
		   case 4:
		   		     		System.out.println("Division of two values="+(num1/num2));
		   		     		break;
		    default:
		    System.out.println("Wrong choice");




	   }





	}


}