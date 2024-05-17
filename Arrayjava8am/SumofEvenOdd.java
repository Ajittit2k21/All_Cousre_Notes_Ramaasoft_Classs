import java.util.Scanner;
class SumofEvenOdd{
	public static void main(String[]args){
		Scanner sobjr=new Scanner(System.in);
		int digit,esum=0,osum=0,count1=0,count2=0;
		System.out.println("Enter any number:");
		int num=sobjr.nextInt();
		while(num!=0)
		{
			digit=num%10;
			if(digit%2==0)
			{
				count1++;
				esum+=digit;
			}
			else
			{
				osum+=digit;
				count2++;
			}


			num/=10;
		}
			System.out.println("Sum of Even="+(esum));
			System.out.println("Sum of odd="+(osum));
			System.out.println("even digit ="+(count1));
			System.out.println("odd digit="+(count2));

	}

}