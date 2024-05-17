import java.util.Scanner;
public class ArrayFunction{

	public static void main(String[]args){

		Scanner sobjr=new Scanner(System.in);
		System.out.println("Enter size row and column:");
		int rsize=sobjr.nextInt();
		int csize=sobjr.nextInt();
		System.out.println("Size of Matrix is="+rsize*csize+"");
		int [][]A=new int [rsize][csize];
		while(true)
		{
			System.out.println("Enter 1n input Matrix");
			System.out.println("Enter 2n show Matrix");
			System.out.println("Enter 3n digonal1 Matrix");
			System.out.println("Enter 4n digonal2 Matrix");
			System.out.println("Enter 5n UpperTriangle1 Matrix");
			System.out.println("Enter 6n UpperTriangle2 Matrix");
			System.out.println("Enter 7n LowerTringle1 Matrix");
			System.out.println("Enter 8n LowerTraingle2 Matrix");
			System.out.println("Enter 9n First and last row  Matrix");
			System.out.println("Enter 10n Second and third row Matrix");
			System.out.println("Enter 11n Third row and first column Matrix");
			System.out.println("Enter 12n last column  Matrix");
			System.out.println("Enter 13n Transpose of Matrix");
			System.out.println("Enter 14n Swap of  Matrix");
			System.out.println("Enter 15n Sum of Matrix");
			System.out.println("Enter 16n Sum of digonal1 Matrix");
			System.out.println("Enter 17n Sum of digonal2 Matrix");
			System.out.println("Enter 18n Sum of UpperTriangle1 Matrix");
			System.out.println("Enter 19n Sum of UpperTriangle2 Matrix");
			System.out.println("Enter 20n Sum of LowerTriangle1 Matrix");
			System.out.println("Enter 21n Sum of LowerTriangle2 Matrix");
			System.out.println("Enter 22n show Identity Matrix");
			System.out.println("Enter 23n Exit");
			System.out.println("Select your choice");
			int ich=sobjr.nextInt();
			switch(ich)
			{
				case 1:
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
						break;

				case 2:
						for(int r=0;r<A.length;r++)
						     {

								 for(int c=0;c<A[r].length;c++)
								 {
									 System.out.print("A["+r+"]["+c+"]="+A[r][c]+"\t");

								 }System.out.println();

	 			             }

						  break;





			}//switch closing







		}//while closing




	}

}