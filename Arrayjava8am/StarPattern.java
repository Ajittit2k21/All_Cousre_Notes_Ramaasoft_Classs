import java.util.Scanner;
class StarPattern
{
	public static void main(String[]args)
	{
		Scanner sobjr=new Scanner(System.in);

		System.out.println("Enter size of pattern:");
		int num=sobjr.nextInt();
		System.out.println("Enter size of spaces:");
		int num2=sobjr.nextInt();
		for(int r=num;r>=1;r--)
		{
			for(int c=num2;c>=r;c--)
			System.out.print("-");
			for(int c=1;c<=r;c++)

				System.out.print("* ");

				System.out.println();
		}

	}

}