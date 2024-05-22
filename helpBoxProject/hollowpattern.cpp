//1kg --->atta(100/pizza)
#include<iostream>
using namespace std;
int main()
{
	int n;
	cout<<"\nEnter size";
	cin>>n;
	for(int r=1;r<=n;r++)
	{
		for(int s=1;s<=n-r;s++)
		cout<<" ";
		for(int j=1;j<=2*r-1;j++)
		{
			if(j==1|| j==2*r-1||r==n)
			cout<<j;
			else
			cout<<" ";
		}
		cout<<"\n";
		
	}
	
}

