import java.util.Scanner;
public class TestClass3{

	public static void main(String []args){

	Scanner sobjr=new Scanner(System.in);
	System.out.println("Enter row size,cols size for Matrix A:");
	int rsize1=sobjr.nextInt();
	int csize1=sobjr.nextInt();
	int  [][]A=new int[rsize1][csize1];
    System.out.println("Enter row size,cols size for Matrix B:");
	int rsize2=sobjr.nextInt();
	int csize2=sobjr.nextInt();

	int  [][]B=new int[rsize2][csize2];
	if(rsize1==rsize2 && csize1==csize2)
	{

			System.out.println("Enter "+rsize1*csize1+" value of Matrix A:");
			for(int r=0;r<A.length;r++)
			{
				System.out.println("Enter Row "+(r+1)+" values:");
				for(int c=0;c<A[r].length;c++)
				{
					   System.out.print("A["+r+"]["+c+"]=");
					   A[r][c]=sobjr.nextInt();
				}

			}

				System.out.println("Enter "+rsize1*csize1+" value of Matrix: B");
				for(int r=0;r<B.length;r++)
				{
					System.out.println("Enter Row "+(r+1)+" values:");
					for(int c=0;c<B[r].length;c++)
					{
						   System.out.print("B["+r+"]["+c+"]=");
						   B[r][c]=sobjr.nextInt();
					}

				}



			System.out.println("Matrix A values Are:");
				for(int r=0;r<A.length;r++)
				{
					for(int c=0;c<A[r].length;c++)
						   System.out.print("A["+r+"]["+c+"]="+A[r][c]+"\t");

					System.out.println();

				}


							System.out.println("Matrix B values are:");
								for(int r=0;r<B.length;r++)
								{
									for(int c=0;c<B[r].length;c++)
										   System.out.print("B["+r+"]["+c+"]="+B[r][c]+"\t");

									System.out.println();

							}
			System.out.println("Sum of Matrix value of Matrix:");
				for(int r=0;r<B.length;r++)
				{
					for(int c=0;c<B[r].length;c++)

					   System.out.print(A[r][c]+B[r][c]+"\t");

					System.out.println();

				}


   }//if close here
   else
   	System.out.println("Sum not possible");
}

}