import java.util.Scanner;
class Table2To20{
	public static void main(String[]args){

		Scanner sobjr=new Scanner(System.in);
		System.out.println("Enter size1 and size2");
		int size1=sobjr.nextInt();
		int size2=sobjr.nextInt();
		for(int r=2;r<=size1;r++)
		{
			for(int c=1;c<=size2;c++)
			System.out.println(""+r+"x"+c+" =" +(r*c));
			System.out.println();

		}


	}


}