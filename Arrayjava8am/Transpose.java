import java.util.Scanner;
public class Transpose{

	public static void main(String args[]){

	Scanner sobjr=new Scanner(System.in);
	System.out.println("Enter row and column size of Matrix:");
	int rsize=sobjr.nextInt();
	int csize=sobjr.nextInt();
	System.out.println("The total size of matrix="+rsize*csize+"");
    int [][]A=new int[rsize][csize];
    System.out.println("Array of Matrix A:");
    for(int r=0;r<A.length;r++)
    {
		System.out.println("Enter row"+(r+1)+" values");
		for(int c=0;c<A[r].length;c++)
		{
			System.out.print("A["+r+"]["+c+"]=");
				 A[r][c]=sobjr.nextInt();




		}System.out.println("");



	}
	 for(int r=0;r<A.length;r++)

	    {

			for(int c=0;c<A[r].length;c++)
			{
				System.out.print("A["+r+"]["+c+"]="+A[r][c]+"\t");




			}System.out.println("");



		}

		System.out.println("Transpose of Matrix A:");
		for(int r=0;r<csize;r++)
			    {

					for(int c=0;c<A[r].length;c++)
					{
						System.out.print("A["+c+"]["+r+"]="+A[c][r]+"\t");




					}System.out.println("");



				}


	}




}