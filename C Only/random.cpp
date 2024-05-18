#include<bits/stdc++.h>
using namespace std;
int main()
{
	int A[5],num;
	srand(time(0));
	for(int r=0;r<5;)
	{
		num=rand();
		if(num%2==0)
		{
			if(num>=10 && num<=99)
			{
			
				A[r]=num;
				r++;
			}
		}
	}
	for(int r=0;r<5;r++)
	{
		cout<<A[r]<<endl;;
	}
}
