
import java.util.Scanner;
public class TestClass1{

	public static void main(String[]args){
	Scanner sobjr=new Scanner(System.in);

     System.out.println("Enter size of row and column Martrix:");
     int rsize=sobjr.nextInt();
     int csize=sobjr.nextInt();

     int [][]A=new int [rsize][csize];
     int [][]B=new int [rsize][csize];
     while(true)
     {	System.out.println("Total size of Matrix is="+rsize*csize+"");

		System.out.print("Enter values of Matrix:");
		for(int r=0;r<A.length;r++)
		{
			System.out.println("Enter row"+(r+1)+"values");
			for(int c=0;c<A[r].length;c++)
			{
				System.out.print("A["+r+"]["+c+"]=");
				A[r][c]=sobjr.nextInt();

			}

		}

     System.out.println("-------------- Array of Matrix A-----------------------");
     for(int r=0;r<A.length;r++)
     {

		 for(int c=0;c<A[r].length;c++)
		 {
			 System.out.print("A["+r+"]["+c+"]="+A[r][c]+"\t");

		 }System.out.println();

	 }
     System.out.println("--------------------------------------------");
	 System.out.println("Enter values of Matrix:");
	 		for(int r=0;r<B.length;r++)
	 		{
				System.out.println("Enter row"+(r+1)+"values");
	 			for(int c=0;c<B[r].length;c++)
	 			{
	 				System.out.print("B["+r+"]["+c+"]=");
	 				B[r][c]=sobjr.nextInt();

	 			}System.out.println();

		}

       System.out.println("-------------- Array of Matrix B-----------------------");
	       for(int r=0;r<B.length;r++)
	       {

	  		 for(int c=0;c<B[r].length;c++)
	  		 {
	  			 System.out.print("B["+r+"]["+c+"]="+B[r][c]+"\t");

	  		 }System.out.println();

	 }
	 System.out.println("-------------- diagonal1 of Matrix B-----------------------");
	 	       for(int r=0;r<B.length;r++)
	 	       {

	 	  		 for(int c=0;c<B[r].length;c++)
	 	  		 {    if(r==c)
	 	  			 		System.out.print("B["+r+"]["+c+"]="+B[r][c]+"\t");
	                 else
	                 		System.out.print("B["+r+"]["+c+"]=--" +"\t");
	 	  		 }System.out.println();

	 }

		System.out.println("--------------Sum Array of Marix A+B -----------------------");
			       for(int r=0;r<rsize;r++)
			       {
			  		 for(int c=0;c<csize;c++)
			  		 {
			  			System.out.print("A["+r+"]+["+c+"]B["+r+"]["+c+"]="+(A[r][c]+B[r][c])+"\t");

			  		 }System.out.println();

	 }

}
	}



}