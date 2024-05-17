import java.util.Scanner;
public class TestClass{

	public static void main(String []args){

	Scanner sobjr=new Scanner(System.in);
	System.out.println("Enter row size,cols size for Matrix A:");
	int rsize=sobjr.nextInt();
	int csize=sobjr.nextInt();
	int  [][]A=new int[rsize][csize];
	if(rsize==csize)
	{

	
			{
				System.out.println("Enter Row "+(r+1)+" values:");
				for(int c=0;c<A[r].length;c++)
				{
					   System.out.print("A["+r+"]["+c+"]=");
					   A[r][c]=sobjr.nextInt();
				}

			}
            System.out.println("\n\n\n\nMatrix A is:");

            for(int r=0;r<A.length;r++)
						{
							for(int c=0;c<A[r].length;c++)
								   System.out.print("A["+r+"]["+c+"]="+A[r][c]+"\t");
							System.out.println();

						}
      System.out.println("Diagonal2 of Matrix is:");
           for(int r=0;r<A.length;r++)
						{
							for(int c=0;c<A[r].length;c++)
								   {
									   if(r+c==rsize-1)
									   		System.out.print("A["+r+"]["+c+"]="+A[r][c]+"\t");
									   else
									   		System.out.print("A["+r+"]["+c+"]=--\t");

							     }
							System.out.println();

						}


 }//if close hre
 else
 	System.out.println("not possible");
}

}		System.out.println("Enter "+rsize*csize+" value of Matrix A:");
			for(int r=0;r<A.length;r++)