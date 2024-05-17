import java.util.Scanner;
public class MultiPlication{

	public static void main(String args[]){
	 Scanner sobjr=new Scanner(System.in);
	 System.out.println("Enter row and column size of Matrix: A" );
	 int rsize1=sobjr.nextInt();
	 int csize1=sobjr.nextInt();
     System.out.println("Size of Matrix A is:"+rsize1*csize1+"");
	 int A[][]=new int[rsize1][csize1];
     System.out.println("Enter row and column size of Matrix: B" );
	 int rsize2=sobjr.nextInt();
	 int csize2=sobjr.nextInt();
	 System.out.println("Size of Matrix B is:"+rsize2*csize2+"");
	 int [][]B=new int[rsize2][csize2];
System.out.println("--------------------------------------------------");
	 while(true)
	 {
		 System.out.println("Enter 1n input A and B Matrix");
		 System.out.println("Enter 2n show Matrix");
		 System.out.println("Enter 3n Multipalication Matrix");
		 System.out.println("Enter 4n Sum of Row Matrix");
		 System.out.println("Enter 5n Sum of Column  Matrix");
		 System.out.println("Enter 6n Transpose Matrix");
		 System.out.println("Enter 7n Sum of Transpose Matrix");
		 System.out.println("Enter 8n Sum of row and column Matrix");
		 System.out.println("Enter 9n Sum of Row1 and Row3  Matrix");
		 System.out.println("Select your choice");
		 int ich=sobjr.nextInt();
		 int sum=0;

		 switch(ich)
			 {
				 case 1:
				 System.out.println("Matrix of A");
				 for(int r=0;r<A.length;r++)
				 {
					 System.out.println("row "+(r+1)+" values");
					 for(int c=0;c<A[r].length;c++)
					 {
						 System.out.print("A["+r+"]["+c+"]=");
						 A[r][c]=sobjr.nextInt();
					 }System.out.println();
				 }
				 System.out.println("Matrix of B");
				 				 for(int r=0;r<B.length;r++)
				 				 {
				 					 System.out.println("row "+(r+1)+" values");
				 					 for(int c=0;c<B[r].length;c++)
				 					 {
				 						 System.out.print("B["+r+"]["+c+"]=");
				 						 B[r][c]=sobjr.nextInt();
				 					 }System.out.println();
				 }break;
				  case 2:
				  System.out.println("Values of Matrix A:");
				 				 for(int r=0;r<A.length;r++)
				 				 {
				 					 for(int c=0;c<A[r].length;c++)
				 					 {
				 						 System.out.print("A["+r+"]["+c+"]="+A[r][c]+"\t");

				 					 }System.out.println();
				 				 }
				 System.out.println("Values of Matrix B:");
				 				 for(int r=0;r<B.length;r++)
				 				 {
				 					 for(int c=0;c<B[r].length;c++)
				 					 {
				 						 System.out.print("B["+r+"]["+c+"]="+B[r][c]+"\t");

				 					 }System.out.println();
				 				 }break;

                 case 3:
                 	System.out.println("Multiplication A and B Matrices:");
                 	if(csize1==rsize2)
                 	{
						for(int r=0;r<A.length;r++)
						{
							for(int c=0;c<A.length;c++)
							{
								System.out.print(A[r][c]*B[r][c]+"\t");



							}System.out.println();

						}




					}
					else
						System.out.println("Multiplication is not possible because your A matrix column size is not to eqaul of B matrix of Rowsize");
					break;
			case 4:
				System.out.println("Sum of row matrix A:");
				for(int r=0;r<A.length;r++)
				{
					for(int c=0;c<A[r].length;c++)
					{
						if(r==0||r==1||r==2)
						{
							System.out.print("A["+r+"]["+c+"]="+A[r][c]+"\t");
							sum+=A[r][c];

						}






					}System.out.println();
					 System.out.println("Sum of row"+(r+1)+"="+sum);
				}break;

		 		case 5:
		 				System.out.println("Sum of column matrix A:");

		 				for(int r=0;r<A.length;r++)
		 				{
		 					for(int c=0;c<A[r].length;c++)
		 					{
		 						if(c==0||c==1||c==2)
		 						{
		 							System.out.print("A["+r+"]["+c+"]="+A[r][c]+"\t");
		 							sum+=A[r][c];

		 						}







		 					}System.out.println();
		 					 //System.out.println("Sum of column="+sum);
		 					}System.out.println("Sum of column="+sum);

		 					break;
                case 6:
				System.out.println("Transpose of Matrix A:");

				for(int r=0;r<csize1;r++)
				{
					for(int c=0;c<A[r].length;c++)
					{

						{
							System.out.print("A["+c+"]["+r+"]="+A[c][r]+"\t");


						}






					}System.out.println();

				}break;

				case 7:
								System.out.println("Sum  of Transpose Matrix A:");

								for(int r=0;r<csize1;r++)
								{
									for(int c=0;c<A[r].length;c++)
									{

										{
											System.out.print("A["+c+"]["+r+"]="+A[c][r]+"\t");
											sum+=A[r][c];

											}





									}System.out.println();

								}System.out.println("sum="+sum);
								break;
							case 8:
								System.out.println("Sum of row and column Matrix A");
								int sum1=0;
								for(int r=0;r<A.length;r++)
								{
									for(int c=0;c<A[r].length;c++)
									{
										if(r==0||r==1||r==2)
										{
											System.out.println("A["+r+"]["+r+"]="+A[r][c]+"\t");
											sum+=A[r][c];
										}
										else if(c==0||c==1||c==2)
										{
											System.out.print("A["+r+"]["+c+"]="+A[r][c]+"\t");
											sum1+=A[r][c];
										}
									}System.out.println();
									System.out.println(sum);
									 System.out.println(sum1);

								}break;

							case 9:
								System.out.println("Sum of row1 and row3 Matrix A");

								for(int r=0;r<A.length;r++)
								{
									for(int c=0;c<A[r].length;c++)
									{
										if(r==0||r==1||r==2)
										{
											System.out.println("A["+r+"]["+r+"]="+A[r][c]+"\t");
											sum+=A[r][c];
										}
										else
											System.out.print("A["+r+"]["+c+"]=--\t");


									}System.out.println();
									System.out.println(sum);



								}
								break;


			 }//switch closing


	 }//while closing






	}
}